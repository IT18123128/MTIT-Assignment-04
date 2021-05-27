package com.mtit.microservices.accountservice.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

    @Id
    private String accId;
    private String firstName;
    private String lastName;
    private String email;

    public Account(){

    }

    public Account(String accId, String firstName, String lastName, String email) {
        this.accId = accId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
