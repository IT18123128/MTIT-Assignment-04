package com.sliit.mtit.microservice.SocialMediaaccountservice.controller;


import com.sliit.mtit.microservice.SocialMediaaccountservice.dto.UserRequest;
import com.sliit.mtit.microservice.SocialMediaaccountservice.dto.UserResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/SocialMediaAccount")
public class AccountController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    UserResponse CreateAccount(@RequestBody UserRequest userRequest){
        System.out.println("user details:"+userRequest);
        var userResponse= new UserResponse();
        userResponse.setAccountId(UUID.randomUUID().toString());
        userResponse.setMessage("Successfully created the user");
        return  userResponse;

    }

}

