package com.alibaba_tencent.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther ChenYong
 * @create 2020-02-21 18:08
 */
@RestController
@RefreshScope
public class ConfigClientController
{
    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/configInfo")
    public String getConfigInfo()
    {
        return "configInfo:" + configInfo + "\r\nport:" + port;
    }
}
