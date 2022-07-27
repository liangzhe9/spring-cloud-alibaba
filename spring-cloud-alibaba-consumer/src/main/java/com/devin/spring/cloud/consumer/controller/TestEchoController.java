package com.devin.spring.cloud.consumer.controller;

import com.devin.spring.cloud.consumer.service.IEchoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RefreshScope
@RestController
public class TestEchoController {
    @Resource
    private IEchoService echoService;

    @Value("${user.name}")
    private String username;

    @GetMapping(value = "feign/echo/{str}")
    public String echo(@PathVariable("str") String str) {
        return echoService.echo(str);
    }

    @GetMapping(value = "lb")
    public String lb() {
        return echoService.lb();
    }

    @GetMapping("feign/echo")
    public String echo() {
        return echoService.echo(username);
    }

}
