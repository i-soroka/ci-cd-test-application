package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestEndpoint {

    @GetMapping
    public String get() {
        return "OK";
    }

    @GetMapping("/test")
    public String test() {
        return "TEST";
    }

}
