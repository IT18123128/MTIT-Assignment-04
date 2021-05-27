package com.mtit.microservice.bankservice;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "bank")
public class Bank {

    @Id
    private String bankId;
    private String bankCode;

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
