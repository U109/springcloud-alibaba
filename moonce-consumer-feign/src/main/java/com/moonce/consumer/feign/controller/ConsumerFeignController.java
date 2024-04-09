package com.moonce.consumer.feign.controller;

import com.moonce.consumer.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Zzz
 * @date: 2024/4/9 15:44
 * @description:
 */
@RestController
public class ConsumerFeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/test/hi")
    public String test() {
        return feignService.test("Hi Feign");
    }
}
