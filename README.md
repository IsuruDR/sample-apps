# Readme of the sample app

## starting

java -jar {jarname} --server.port={required port}

* Note: please create a directory structure as below named ussd/json and place json files to match user response

```
|--- sample-app-0.0.1-SNAPSHOT.jar
|--- json
       |---ussd
            |--- 1.json
            |--- 2.json
            |--- 3.json
            |--- 99.json
```

Ex: if user replies with 2 create a json named 2.json in the json directory with the indended response
is user replies with 99 create a json named 99.json in the json directory with the indended response

## Initial call of SP for USSD

curl -X POST \
  http://pre-api.apigate.com/ussd/v1/outbound/tel%3A%2B94773851112 \
  -H 'Authorization: Bearer 899aebe7-924c-304a-b886-76d6dc4e7595' \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/json' \
  -H 'Postman-Token: 62395af0-e8e6-428b-8c36-166ab9676c6a' \
  -d '{
   "outboundUSSDMessageRequest":{
      "address":"tel:+94773851112",
      "clientCorrelator":"12366",
      "shortCode":"tel:7740",
      "keyword":"360",
      "outboundUSSDMessage":"Survey:\nWhat's you faviorite movie?\n1. Ranja\n2. One shot One\n99. Cancel",
      "responseRequest":{
         "notifyURL":"54.193.73.88:8080/ussdsample/inbound",
         "callbackData":"some-data-useful-to-the-requester"
      },
      "ussdAction":"mtinit"
   }
}'