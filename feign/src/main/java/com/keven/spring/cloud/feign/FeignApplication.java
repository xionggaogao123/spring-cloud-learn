package com.keven.spring.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author keven
 * @date 2018-04-29 上午8:39
 * @Description
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FeignApplication {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(FeignApplication.class);
        application.run(args);
    }
}
