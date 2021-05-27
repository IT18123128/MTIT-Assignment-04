package com.sliit.mtit.microservice.ProductCartService.dto;

public class ResponseCart {

    private String accountID;
    private String orderID;
    private String message;

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseCart{" +
                "accountID='" + accountID + '\'' +
                ", orderID='" + orderID + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
