package org.nlb.hello.dubbo.service.user.comsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@EnableHystrix
@SpringBootApplication
public class HelloDubboServiceUserComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloDubboServiceUserComsumerApplication.class, args);
    }

}
