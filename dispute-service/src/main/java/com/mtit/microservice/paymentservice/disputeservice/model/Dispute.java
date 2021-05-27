package com.mtit.microservice.paymentservice.disputeservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dispute")
public class Dispute {

    @Id
    private String disputeId;
    private String disputeStatus;
    private String disputeDate;
    private String customerId;


    public Dispute(String disputeId, String disputeStatus, String disputeDate, String customerId) {
        this.disputeId = disputeId;
        this.disputeStatus = disputeStatus;
        this.disputeDate = disputeDate;
        this.customerId = customerId;
    }

    public Dispute() {

    }

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


