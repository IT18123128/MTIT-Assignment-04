package com.mtit.microservice.paymentservice.disputeservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "payment")
public class Payment {

    @Id
    private String paymentId;
    private String customerName;
    private String paymentMethod;
    private String paymentDate;
    private Double paymentValue;
    private String productId;
    private String bankCode;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Payment(){

    }

    public String getBankCode() {
        return bankCode;
    }

    public Payment(String paymentId, String customerName, String paymentMethod, String paymentDate, Double paymentValue, String productId, String bankCode) {
        this.paymentId = paymentId;
        this.customerName = customerName;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.paymentValue = paymentValue;
        this.productId = productId;
        this.bankCode = bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }


    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Double getPaymentValue() {
        return paymentValue;
    }

    public void setPaymentValue(Double paymentValue) {
        this.paymentValue = paymentValue;
    }
}
