package com.keven.spring.cloud.feign.controller;

import com.keven.spring.cloud.feign.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author keven
 * @date 2018-04-29 上午8:45
 * @Description
 */
@RestController
public class HelloController {

    @Autowired
    private SchedualService schedualService;

    @GetMapping("/test")
    public String sayHello(String name) {
        return schedualService.sayHiFromClientOne(name);
    }
}
