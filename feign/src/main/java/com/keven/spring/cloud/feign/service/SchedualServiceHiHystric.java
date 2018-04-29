package com.keven.spring.cloud.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author keven
 * @date 2018-04-29 上午9:10
 * @Description
 */
@Component
public class SchedualServiceHiHystric implements SchedualService{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
