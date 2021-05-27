package com.mtit.microservice.paymentservice.disputeservice.controller;

import com.mtit.microservice.paymentservice.disputeservice.model.Payment;
import com.mtit.microservice.paymentservice.disputeservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;

@RestController
public class paymentController {

    @Autowired
    public paymentController(){

    }

    @Autowired
    private PaymentRepository paymentRepository;

    // add new payment
    @PostMapping(value = "/payment", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    Payment makePayment(@RequestBody Payment payment) {

        payment.setPaymentId("PayID-" + UUID.randomUUID().toString());

        Payment dbPayment =  paymentRepository.save(payment);

        return dbPayment;
    }

    // Retrive Payment Details
    @GetMapping("/getPayments")
    public List<Payment> getAllPayments() {

        List <Payment> payment = paymentRepository.findAll();
        return payment;
    }

    //Retrieve specific payment
    @PostMapping(value="/getSpecific", consumes = "application/json", produces = "application/json")
    public @ResponseBody Payment getSpcificPayment(@RequestBody Payment payment){

        System.out.println(payment.getProductId());
        Payment dbPayment = paymentRepository.findByProductId(payment.getProductId());

        System.out.println(dbPayment);
        return  dbPayment;


    }

    //Retrieve payments for specific bank
    @PostMapping(value="/getPaymentsForBank", consumes = "application/json", produces = "application/json")
    public @ResponseBody Payment getPaymentsForBank(@RequestBody Payment payment){

        System.out.println(payment.getBankCode());
        Payment dbPayment = paymentRepository.getPaymentForBank(payment.getBankCode());

        System.out.println(dbPayment);
        return  dbPayment;


    }




}
