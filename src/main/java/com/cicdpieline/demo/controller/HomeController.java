package com.cicdpieline.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${application.version:unknown}")
    private String version;

    @RequestMapping("/version")
    public String version() {
        return "Version: " + version;
    }

    @RequestMapping("/")
    public String home() {
        return "App is running!";
    }
}
