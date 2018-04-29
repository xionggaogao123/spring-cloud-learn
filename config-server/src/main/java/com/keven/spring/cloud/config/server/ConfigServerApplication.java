package com.keven.spring.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author keven
 * @date 2018-04-29 上午11:28
 * @Description
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(ConfigServerApplication.class);
        application.run(args);
    }
}
