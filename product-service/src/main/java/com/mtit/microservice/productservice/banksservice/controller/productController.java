package com.mtit.microservice.productservice.banksservice.controller;

import com.mtit.microservice.productservice.banksservice.model.Product;
import com.mtit.microservice.productservice.banksservice.model.RequestData;
import com.mtit.microservice.productservice.banksservice.model.ResponsePayment;
import com.mtit.microservice.productservice.banksservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@RestController
public class productController {

    @Autowired
    public productController() {
    }

    @Autowired
    private ProductRepository productRepository;
    private RestTemplate restTemplate;

    // add new product
    @PostMapping(value = "/product", consumes = "application/json", produces = "application/json")
    public @ResponseBody
    Product addProduct(@RequestBody Product product) {

        product.setProductId("prod-" + UUID.randomUUID().toString());

      Product dbProduct =  productRepository.save(product);

      return dbProduct;

    }
    // Retrive product
    @GetMapping("/getProducts")
    public List<Product> getAllProducts() {

       List <Product> product = productRepository.findAll();
        return product;
    }


    @PostMapping("/getPaymentForProduct")
    public @ResponseBody
    ResponsePayment getPaymentDetails(@RequestBody String productId){

        HttpHeaders headers = new HttpHeaders();
        var requestData = new RequestData();

        System.out.println(productId);
        requestData.setProductId(productId);

        HttpEntity<RequestData> request = new HttpEntity<>(requestData, headers);

        ResponseEntity<ResponsePayment> responsePaymentResponseEntity = restTemplate.postForEntity("http://localhost:8084/getSpecific", request, ResponsePayment.class);

        ResponsePayment responsePaymentNew = new ResponsePayment();

        responsePaymentNew.setPaymentId(responsePaymentResponseEntity.getBody().getPaymentId());
        responsePaymentNew.setCustomerName(responsePaymentResponseEntity.getBody().getPaymentDate());
        responsePaymentNew.setPaymentDate(responsePaymentResponseEntity.getBody().getPaymentDate());

        return  responsePaymentNew;




    }


}
