package com.wso2telco.dep.sampleapp.model;

public class SMSMOResponse {

    private InboundSMSMessageNotification inboundSMSMessageNotification;

    public InboundSMSMessageNotification getInboundSMSMessageNotification() {
        return inboundSMSMessageNotification;
    }

    public void setInboundSMSMessageNotification(InboundSMSMessageNotification inboundSMSMessageNotification) {
        this.inboundSMSMessageNotification = inboundSMSMessageNotification;
    }

    public class InboundSMSMessageNotification {

        private String callbackData;
        private InboundSMSMessage inboundSMSMessage;

        public String getCallbackData() {
            return callbackData;
        }

        public void setCallbackData(String callbackData) {
            this.callbackData = callbackData;
        }

        public InboundSMSMessage getInboundSMSMessage() {
            return inboundSMSMessage;
        }

        public void setInboundSMSMessage(InboundSMSMessage inboundSMSMessage) {
            this.inboundSMSMessage = inboundSMSMessage;
        }

        public class InboundSMSMessage {
            private String dateTime;
            private String destinationAddress;
            private String messageId;
            private String message;
            private String senderAddress;

            public String getDateTime() {
                return dateTime;
            }

            public void setDateTime(String dateTime) {
                this.dateTime = dateTime;
            }

            public String getDestinationAddress() {
                return destinationAddress;
            }

            public void setDestinationAddress(String destinationAddress) {
                this.destinationAddress = destinationAddress;
            }

            public String getMessageId() {
                return messageId;
            }

            public void setMessageId(String messageId) {
                this.messageId = messageId;
            }

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public String getSenderAddress() {
                return senderAddress;
            }

            public void setSenderAddress(String senderAddress) {
                this.senderAddress = senderAddress;
            }
        }
    }
}


/*
{

        "inboundSMSMessageNotification": {
        "callbackData": "12345",
        "inboundSMSMessage": {
        "dateTime": "2009-11-19T12:00:00",
        "destinationAddress": "3456",
        "messageId": "mes1234",
        "message": "Vote for Mega Boy Band",
        "senderAddress": "+12345678012"
        }
        }
        }*/
