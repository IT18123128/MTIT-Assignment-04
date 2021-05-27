package com.sliit.mtit.microservice.ProductCartService.dto;

public class AccountResponse {
    private static String accountId;

    private String message;

    public static String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
