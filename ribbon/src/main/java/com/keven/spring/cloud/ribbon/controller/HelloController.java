package com.keven.spring.cloud.ribbon.controller;

import com.keven.spring.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author keven
 * @date 2018-04-29 上午7:48
 * @Description
 */
@RestController
public class HelloController {

    @Autowired
    public HelloService helloService;

    @GetMapping("test")
    public String sayHello(String name) {
        return helloService.hello(name);
    }
}
