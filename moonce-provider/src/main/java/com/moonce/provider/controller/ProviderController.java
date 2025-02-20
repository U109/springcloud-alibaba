package com.moonce.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Zzz
 * @date: 2024/4/9 14:21
 * @description:
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String port;

    // 注入配置文件上下文
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    // 从上下文中读取配置
    @GetMapping(value = "/hi")
    public String sayHi() {
        return "Hello " + applicationContext.getEnvironment().getProperty("user.name");
    }


    @GetMapping(value = "/test/{message}")
    public String test(@PathVariable String message) {
        return "当前服务收到消息： " + message + "， 该服务由端口： " + port + "提供。";
    }

}
