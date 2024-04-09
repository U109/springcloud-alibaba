package com.moonce.consumer.feign.service.fallback;

import com.moonce.consumer.feign.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * @author: Zzz
 * @date: 2024/4/9 16:17
 * @description:
 */
@Component
public class FeignServiceFallback implements FeignService {

    @Override
    public String test(String message) {
        return "test fallback";
    }

}