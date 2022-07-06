package com.mu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author MUZUKI
 * EnableEurekaServer  开启Eureka注册中心服务端
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer01Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer01Application.class, args);
    }

}
