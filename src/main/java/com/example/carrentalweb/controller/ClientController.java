package com.example.carrentalweb.controller;

import com.example.carrentalweb.model.Client;
import com.example.carrentalweb.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;
    @PostMapping("/request")
    public Client createRequest(@RequestBody Client client){
        return clientService.insertClient(client);
    }
}
