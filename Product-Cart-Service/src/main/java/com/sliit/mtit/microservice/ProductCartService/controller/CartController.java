package com.sliit.mtit.microservice.ProductCartService.controller;


import com.sliit.mtit.microservice.ProductCartService.dto.RequestCart;
import com.sliit.mtit.microservice.ProductCartService.dto.ResponseCart;
import com.sliit.mtit.microservice.ProductCartService.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("cartservice")
public class CartController {

    @Autowired
    private CartService cart;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody ResponseCart CreateCart(@RequestBody RequestCart requestCart){

        System.out.println("Order details:"+requestCart);
        var orderResponse= new ResponseCart();
        orderResponse.setOrderID(UUID.randomUUID().toString());
        orderResponse.setMessage("Succcessfully created the Cart order");

        return cart.CreateOrderFromCart(requestCart);

    }
}
