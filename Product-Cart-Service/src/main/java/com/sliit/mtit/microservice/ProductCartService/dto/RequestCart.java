package com.sliit.mtit.microservice.ProductCartService.dto;

public class RequestCart {

    private static String username;
    private static String email;
    private String AccountType;
    private String ProductID;
    private String quantity;
    private String address;

    public static String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "RequestCart{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", AccountType='" + AccountType + '\'' +
                ", ProductID='" + ProductID + '\'' +
                ", quantity='" + quantity + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
