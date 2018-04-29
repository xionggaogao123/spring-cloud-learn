package com.keven.spring.cloud.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author keven
 * @date 2018-04-29 上午8:41
 * @Description
 */
@FeignClient(value = "service-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualService {

    @GetMapping("test")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
