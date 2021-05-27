package com.mtit.microservice.productservice.banksservice.controller;

import com.mtit.microservice.productservice.banksservice.model.RequestData;
import com.mtit.microservice.productservice.banksservice.model.ResponsePayment;
import com.mtit.microservice.productservice.banksservice.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class BankController {

    @Autowired
    public BankController() {
    }

//    @Autowired
//    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private BankRepository bankRepository;



    @GetMapping("/")
    public String index() {
        return "Hello ! ABC Company Customer Micro service";
    }

    //Retrieve all the payments for particular Bank
    @PostMapping(value="/getPaymentsByBankCode", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    ResponsePayment getPaymentsForBank(@RequestBody String bankCode){

        HttpHeaders headers = new HttpHeaders();
        var requestData = new RequestData();
        System.out.println(bankCode);
        requestData.setBankCode(bankCode);
        HttpEntity<RequestData> request = new HttpEntity<>(requestData, headers);

        ResponseEntity<ResponsePayment> responsePaymentResponseEntity = restTemplate().postForEntity("http://localhost:8084/getPaymentsForBank", request, ResponsePayment.class);

        ResponsePayment responsePaymentNew = new ResponsePayment();

        responsePaymentNew.setPaymentId(responsePaymentResponseEntity.getBody().getPaymentId());
        responsePaymentNew.setCustomerName(responsePaymentResponseEntity.getBody().getPaymentDate());
        responsePaymentNew.setPaymentDate(responsePaymentResponseEntity.getBody().getPaymentDate());

        return  responsePaymentNew;

    }

}
