package com.alibaba_tencent.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: NacosConfigMain
 * @Desc:
 * @Author: Chen Yong
 * @Date: 2020-05-15 9:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigMain {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigMain.class, args);
    }
}
