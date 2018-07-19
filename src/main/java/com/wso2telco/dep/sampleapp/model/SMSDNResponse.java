package com.wso2telco.dep.sampleapp.model;


public class SMSDNResponse {

   private DeliveryInfoNotification deliveryInfoNotification;

    public DeliveryInfoNotification getDeliveryInfoNotification() {
        return deliveryInfoNotification;
    }

    public void setDeliveryInfoNotification(DeliveryInfoNotification deliveryInfoNotification) {
        this.deliveryInfoNotification = deliveryInfoNotification;
    }

    public class DeliveryInfoNotification {

        private String callbackData;
        private String serverReferenceCode;
        private String messageReferenceCode;
        private String senderAddress;
        private DeliveryInfo deliveryInfo;


        public String getCallbackData () {
            return callbackData;
        }

        public void setCallbackData (String callbackData) {
            this.callbackData = callbackData;
        }

        public String getServerReferenceCode() {
            return serverReferenceCode;
        }

        public void setServerReferenceCode(String serverReferenceCode) {
            this.serverReferenceCode = serverReferenceCode;
        }

        public String getMessageReferenceCode() {
            return messageReferenceCode;
        }

        public void setMessageReferenceCode(String messageReferenceCode) {
            this.messageReferenceCode = messageReferenceCode;
        }

        public String getSenderAddress() {
            return senderAddress;
        }

        public void setSenderAddress(String senderAddress) {
            this.senderAddress = senderAddress;
        }

        public DeliveryInfo getDeliveryInfo () {
            return deliveryInfo;
        }

        public void setDeliveryInfo (DeliveryInfo deliveryInfo) {
            this.deliveryInfo = deliveryInfo;
        }

        public class DeliveryInfo {
            private String operatorCode;
            private String filterCriteria;
            private String address;
            private String deliveryStatus;

            public String getOperatorCode() {
                return operatorCode;
            }

            public void setOperatorCode(String operatorCode) {
                this.operatorCode = operatorCode;
            }

            public String getFilterCriteria() {
                return filterCriteria;
            }

            public void setFilterCriteria(String filterCriteria) {
                this.filterCriteria = filterCriteria;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getDeliveryStatus() {
                return deliveryStatus;
            }

            public void setDeliveryStatus(String deliveryStatus) {
                this.deliveryStatus = deliveryStatus;
            }
        }


    }



}


/*{
        "deliveryInfoNotification":{
        "callbackData":"test call",
        "serverReferenceCode":"OB-3003-8496abbb39e54275ae0f602bccebcf4c",
        "messageReferenceCode":"8496abbb39e54275ae0f602bccebcf4c-0",
        "senderAddress":"tel:+87711",
        "deliveryInfo":{
        "operatorCode":"DIALOG",
        "filterCriteria":"test9",
        "address":"tel:+94773851112",
        "deliveryStatus":"DeliveredToNetwork"
        }
        }
        }*/




    /*



    {
        "deliveryInfoNotfication": {
        "callbackData": " doSomething()",
                "deliveryInfo": {
            "address": "tel:+00123456789",
                    "deliveryStatus": "DeliveredToNetwork"
        }
    }
    }*/
