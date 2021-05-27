package com.mtit.microservices.accountservice.controller;
import com.mtit.microservices.accountservice.dto.RequestData;
import com.mtit.microservices.accountservice.dto.ResponseOrder;
import com.mtit.microservices.accountservice.model.Account;
import com.mtit.microservices.accountservice.dto.UserRequest;
import com.mtit.microservices.accountservice.dto.UserResponse;
import com.mtit.microservices.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;
    private RestTemplate restTemplate;

    // add new account
    @PostMapping(value = "/account",consumes = "application/json", produces = "application/json")
    public @ResponseBody Account createUser(@RequestBody Account account) {

        account.setAccId("AccID-" + UUID.randomUUID().toString());

        Account dbAccount = accountRepository.save(account);
        return dbAccount;
    }


    //Retrieve all the payments for particular com.mtit.microservice.bankservice.Bank
    @PostMapping(value="/getOrderByCusCode", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    ResponseOrder getOrderForUser(@RequestBody String customerId){

        HttpHeaders headers = new HttpHeaders();
        var requestData = new RequestData();
        System.out.println(customerId);
        requestData.setCustomerId(customerId);
        HttpEntity<RequestData> request = new HttpEntity<>(requestData, headers);

        ResponseEntity<ResponseOrder> responsePaymentResponseEntity = restTemplate.postForEntity("http://localhost:8084/get-order-by-customerk", request, ResponseOrder.class);

        ResponseOrder responsePaymentNew = new ResponseOrder();

        responsePaymentNew.setOrderId(responsePaymentResponseEntity.getBody().getOrderId());
        return  responsePaymentNew;

    }



}
