package com.moonce.consumer.feign.service;

import com.moonce.consumer.feign.service.fallback.FeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: Zzz
 * @date: 2024/4/9 15:44
 * @description:
 */
@FeignClient(value = "moonce-provider", fallback = FeignServiceFallback.class)
public interface FeignService {

    @GetMapping(value = "/test/{message}")
    String test(@PathVariable("message") String message);

}
