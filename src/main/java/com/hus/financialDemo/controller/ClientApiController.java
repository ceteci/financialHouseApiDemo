package com.hus.financialDemo.controller;

import com.hus.financialDemo.client.ClientApiClient;
import com.hus.financialDemo.model.response.ClientResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientApiController {

    @Autowired
    private  ClientApiClient clientApiClient;

    @GetMapping("/client/{transactionId}")
    private ClientResponse getClient(@PathVariable  String transactionId){
        return clientApiClient.getClient(transactionId);
    }

}
