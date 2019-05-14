package org.nlb.hello.dubbo.user.service.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.nlb.hello.dubbo.service.user.api.userService;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class helloimpl implements userService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @HystrixCommand
    @Override
    public String sayHi() {
      //  return "hello Dubbo"+port;
        throw new RuntimeException("运行超时");
    }
}
