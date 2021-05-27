package com.mtit.microservice.customerservice.model;

public class DisputeResponse {

    private String disputeId;
    private String disputeStatus;
    private String disputeDate;
    private String customerId;



    public String getDisputeId() {
        return disputeId;
    }

    public void setDisputeId(String disputeId) {
        this.disputeId = disputeId;
    }

    public String getDisputeStatus() {
        return disputeStatus;
    }

    public void setDisputeStatus(String disputeStatus) {
        this.disputeStatus = disputeStatus;
    }

    public String getDisputeDate() {
        return disputeDate;
    }

    public void setDisputeDate(String disputeDate) {
        this.disputeDate = disputeDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


}
