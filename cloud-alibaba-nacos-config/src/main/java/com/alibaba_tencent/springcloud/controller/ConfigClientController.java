package com.alibaba_tencent.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther ChenYong
 * @create 2020-02-23 17:02
 */
@RestController
@RefreshScope //支持Nacos的动态刷新功能。
public class ConfigClientController
{
    @Value("${config.info}")
    private String configInfo;

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }

    @GetMapping("config/info2")
    public String getConfigInfo2() {
        String name = getProperty("persion.name");
        String age = getProperty("persion.age");
        String birthday = getProperty("persion.birthday");
        return name + " " + age + " " +  birthday;
    }

    private String getProperty(String key) {
        return applicationContext.getEnvironment().getProperty(key);
    }
}
