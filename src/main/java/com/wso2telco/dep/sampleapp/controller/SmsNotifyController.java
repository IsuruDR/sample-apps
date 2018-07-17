package com.wso2telco.dep.sampleapp.controller;

import com.google.gson.Gson;
import com.wso2telco.dep.sampleapp.model.SMSDNResponse;
import com.wso2telco.dep.sampleapp.model.SMSMOResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "/smssample")
public class SmsNotifyController {

    private static final Logger logger = LoggerFactory.getLogger(SmsNotifyController.class);


    @RequestMapping(path = "/deliveryNotification", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity receiveSmsDNFromHub(@RequestBody SMSDNResponse smsdnResponse) throws Exception {

        UUID correlationID = UUID.randomUUID();
        logger.info("Received SMS DN body to correlation id {}  {} ", correlationID, new Gson().toJson(smsdnResponse));
        return ResponseEntity.ok().build();

    }

    @RequestMapping(path = "/moNotification", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity receiveSmsMOFromHub(@RequestBody SMSMOResponse smsmoResponse) throws Exception {

        UUID correlationID = UUID.randomUUID();
        logger.info("Received SMS DN body to correlation id {}  {} ", correlationID, new Gson().toJson(smsmoResponse));
        return ResponseEntity.ok().build();

    }

}



