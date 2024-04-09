package com.moonce.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Zzz
 * @date: 2024/4/9 14:18
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient //SpringCloud提供的原生注解，用来表示这是一个Nacos客户端。
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
