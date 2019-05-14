package org.nlb.hello.dubbo.user.service.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@EnableHystrix
@SpringBootApplication
public class HelloDubboUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloDubboUserServiceProviderApplication.class, args);
        Main.main(args);
    }

}
