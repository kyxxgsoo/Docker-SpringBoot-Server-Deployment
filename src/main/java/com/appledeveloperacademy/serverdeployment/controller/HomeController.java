package com.appledeveloperacademy.serverdeployment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${app.version:1.0.0}")
    String version;

    @GetMapping("/")
    public String home() {
        return "Hello CI/CD! version: " + version;
    }

    @GetMapping("/liver")
    public String getNickname() {
        return "My name is liver";
    }
}
