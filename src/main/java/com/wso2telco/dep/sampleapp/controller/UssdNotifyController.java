package com.wso2telco.dep.sampleapp.controller;


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.wso2telco.dep.sampleapp.model.UssdInboundRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping(path = "/ussdsample")
public class UssdNotifyController {

    private static final Logger logger = LoggerFactory.getLogger(UssdNotifyController.class);

    @RequestMapping(path = "/inbound", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String receiveUssdFromHub(@RequestBody UssdInboundRequest ussdInboundRequest) throws Exception {
        UssdInboundRequest.InboundUSSDMessageRequest inboundUSSDMessageRequest = ussdInboundRequest.getInboundUSSDMessageRequest();

        UUID correlationID = UUID.randomUUID();
        logger.info("Received ussd inbound notification with correlation id {}", correlationID);
        logger.debug("Received body to correlation id {} \n {} ", correlationID, new Gson().toJson(inboundUSSDMessageRequest));

        String inboundUSSDMessage = inboundUSSDMessageRequest.getInboundUSSDMessage();
        FileReader fileReader = null;
        JsonElement jsonElement = null;

        try {
            String fileName = "json/ussd/" + inboundUSSDMessage.trim() + ".json";
            JsonParser jsonParser = new JsonParser();

            fileReader = new FileReader(fileName);
            jsonElement = jsonParser.parse(fileReader);

        } catch (FileNotFoundException e) {
            logger.error("Error occurred", e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    logger.error("Error occurred", e);
                }
            }
        }
        if (jsonElement == null) {
            throw new Exception("Please add json response json files to json folder");
        }
        String response = jsonElement.toString();
        logger.debug("Sending response with correlation id {} \n {}", correlationID, response);
        return response;
    }

}
