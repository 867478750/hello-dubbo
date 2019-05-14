package org.nlb.hello.dubbo.service.user.comsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.nlb.hello.dubbo.service.user.api.userService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class userController {
    @Reference(version = "1.0.0")
    private userService userService;
    @HystrixCommand(fallbackMethod = "error")
    @RequestMapping(value = "/sayHi")
    public String sayHi(){
        return userService.sayHi();
    }

    public String error(){
        return "Hystrix";
    }
}
