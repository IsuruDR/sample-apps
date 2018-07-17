package com.wso2telco.dep.sampleapp.model;


public class SMSDNResponse {

   private DeliveryInfoNotfication deliveryInfoNotfication;

    public DeliveryInfoNotfication getDeliveryInfoNotfication () {
        return deliveryInfoNotfication;
    }

    public void setDeliveryInfoNotfication (DeliveryInfoNotfication deliveryInfoNotfication){
        this.deliveryInfoNotfication = deliveryInfoNotfication;
    }

    public class DeliveryInfoNotfication {

        private String callbackData;
        private deliveryInfo deliveryInfo;


        public String getCallbackData () {
            return callbackData;
        }

        public void setCallbackData (String callbackData) {
            this.callbackData = callbackData;
        }

        public deliveryInfo getDeliveryInfo () {
            return deliveryInfo;
        }

        public void setDeliveryInfo (deliveryInfo deliveryInfo) {
            this.deliveryInfo = deliveryInfo;
        }

        public class deliveryInfo {
            private String address;
            private String deliveryStatus;

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
