package com.devin.spring.cloud.consumer.service.serviceImpl;

import com.devin.spring.cloud.consumer.service.IEchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceImpl implements IEchoService {
    @Override
    public String echo(String string) {
        return "你的网络有问题";
    }

    @Override
    public String lb() {
        return "请联系管理员";
    }
}
