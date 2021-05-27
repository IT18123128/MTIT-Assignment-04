package com.mtit.microservice.paymentservice.disputeservice.controller;

import com.mtit.microservice.paymentservice.disputeservice.model.Dispute;
import com.mtit.microservice.paymentservice.disputeservice.repository.DisputeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DisputeController {

    @Autowired
    public DisputeController() {
    }
    @Autowired
    private DisputeRepository disputeRepository;

    // add new product
//    @PostMapping(value = "/add-dispute", consumes = "application/json", produces = "application/json")
//    public @ResponseBody
//    Payment makePayment(@RequestBody Payment payment) {
//
//    }


    @GetMapping("/")
    public String index() {
        return "Hello ! ABC Company Customer Micro service";
    }

    //get dispute by customerCode
    @PostMapping(value = "/get-dispute-by-customer", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    Dispute getDisputeByCustomerCode(@RequestBody Dispute dispute) {
        System.out.println(dispute.getCustomerId());

        String customerId = dispute.getCustomerId();

        Dispute dbDispute = this.disputeRepository.getDisputeByCustomer(customerId);
        return dbDispute;

    }


}
