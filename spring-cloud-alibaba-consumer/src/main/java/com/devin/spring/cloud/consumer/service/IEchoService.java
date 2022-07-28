package com.devin.spring.cloud.consumer.service;

import com.devin.spring.cloud.consumer.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-provider", fallback = EchoServiceFallback.class)
public interface IEchoService {
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable("string") String string);

    @GetMapping(value = "/lb")
    public String lb();

}
