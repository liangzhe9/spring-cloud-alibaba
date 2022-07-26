package com.devin.spring.cloud.consumer.service;

import com.devin.spring.cloud.consumer.service.serviceImpl.EchoServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-provider", fallback = EchoServiceImpl.class)
public interface IEchoService {
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable("string")String string);

    @GetMapping(value = "/lb")
    public String lb();

}
