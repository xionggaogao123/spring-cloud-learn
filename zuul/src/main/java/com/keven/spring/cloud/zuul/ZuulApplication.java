package com.keven.spring.cloud.zuul;

import com.keven.spring.cloud.zuul.filter.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author keven
 * @date 2018-04-29 上午10:22
 * @Description
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulApplication {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(ZuulApplication.class);
        application.run(args);
    }


    @Bean
    public MyFilter myFilter() {
        return new MyFilter();
    }
}
