package com.sliit.mtit.microservice.ProductCartService.service;

import com.sliit.mtit.microservice.ProductCartService.dto.AccountResponse;
import com.sliit.mtit.microservice.ProductCartService.dto.RequestCart;
import com.sliit.mtit.microservice.ProductCartService.dto.ResponseCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class CartService {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseCart CreateOrderFromCart(RequestCart requestCart) {

        var createCart = new RequestCart();
        createCart.setUsername(RequestCart.getUsername());
        createCart.setEmail(RequestCart.getEmail());

        ResponseEntity<AccountResponse> accountResponse = restTemplate.postForEntity("http://localhost:8084/SocialMediaAccount", createCart, AccountResponse.class);

        var orderResponse = new ResponseCart();
        orderResponse.setOrderID(UUID.randomUUID().toString());
        orderResponse.setAccountID(AccountResponse.getAccountId());
        orderResponse.setMessage("Succcessfully created the order");

        return orderResponse;


    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){return builder.build();}


}
