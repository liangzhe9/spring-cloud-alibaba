package com.devin.spring.cloud.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Value("${server.port}")
    private String port;

    @GetMapping("echo/{string}")
    public String echo(@PathVariable("string") String string) {
        return "Hello Nacos provider: " + string;
    }

    @GetMapping("lb")
    public String lb() {
        return "Hello Nacos form port:" + port;
    }
}