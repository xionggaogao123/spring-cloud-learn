package com.spring.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author keven
 * @date 2018-04-28 下午10:59
 * @Description
 */
@EnableEurekaServer
@SpringBootApplication
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ServerApplication.class);
        application.run(args);
    }
}
