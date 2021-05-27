package com.mtit.microservice.bankservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RestController
public class BankController {

    @Autowired
    public BankController() {
    }
    @Autowired
    private BankRepository bankRepository;

    private RestTemplate restTemplate;


    @GetMapping("/")
    public String index() {
        return "Hello ! ABC Company Bank Micro service";
    }


    // add new bank
    @PostMapping(value = "/bank", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    Bank addBank(@RequestBody Bank bank) {

        bank.setBankId("bank-" + UUID.randomUUID().toString());

        Bank dbBank =  bankRepository.save(bank);

        return dbBank;

    }

    //Retrieve all the payments for particular Bank service
    @PostMapping(value="/getPaymentsByBankCode", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    ResponsePayment getPaymentsForBank(@RequestBody String bankCode){

        HttpHeaders headers = new HttpHeaders();
        var requestData = new RequestData();
        System.out.println(bankCode);
        requestData.setBankCode(bankCode);
        HttpEntity<RequestData> request = new HttpEntity<>(requestData, headers);

        ResponseEntity<ResponsePayment> responsePaymentResponseEntity = restTemplate.postForEntity("http://localhost:8084/getPaymentsForBank", request, ResponsePayment.class);

        ResponsePayment responsePaymentNew = new ResponsePayment();

        responsePaymentNew.setPaymentId(responsePaymentResponseEntity.getBody().getPaymentId());
        responsePaymentNew.setCustomerName(responsePaymentResponseEntity.getBody().getPaymentDate());
        responsePaymentNew.setPaymentDate(responsePaymentResponseEntity.getBody().getPaymentDate());

        return  responsePaymentNew;

    }

}
