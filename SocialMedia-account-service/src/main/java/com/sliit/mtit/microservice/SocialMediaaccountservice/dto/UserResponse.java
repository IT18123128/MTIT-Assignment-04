package com.sliit.mtit.microservice.SocialMediaaccountservice.dto;

public class UserResponse {
    private String accountId;
    private String message;

    public String getAccountId() {
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

    @Override
    public String toString() {
        return "UserResponse{" +
                "accountId='" + accountId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
