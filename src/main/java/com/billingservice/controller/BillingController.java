package com.billingservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerbilling")
public class BillingController {

    @GetMapping("/test")
    public String test()
    {
        return "Test";
    }

    @GetMapping("/retrievepaymethistory")
    public ResponseEntity<Object> getCustomerPaymentHistory(@RequestBody String userId)
    {
        return new ResponseEntity<>("", HttpStatus.OK);
    }

}
