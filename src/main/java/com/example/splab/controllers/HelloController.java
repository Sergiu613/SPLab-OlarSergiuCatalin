package com.example.splab.controllers;

import com.example.splab.difexample.ClientComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final ClientComponent client1;
    private final ClientComponent client2;

    @Autowired
    public HelloController(ClientComponent client1, ClientComponent client2) {
        this.client1 = client1;
        this.client2 = client2;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Client 1: " + client1 + "<br>Client 2: " + client2;
    }
}