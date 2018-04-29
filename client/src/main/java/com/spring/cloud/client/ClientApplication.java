package com.spring.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author keven
 * @date 2018-04-28 下午11:23
 * @Description
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ClientApplication.class);
        application.run(args);
    }

    @GetMapping("test")
    public String testClient(String name) {
        return name + "----" + 1;
    }
}
