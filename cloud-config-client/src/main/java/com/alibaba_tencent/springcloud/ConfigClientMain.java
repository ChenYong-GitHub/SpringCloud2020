package com.alibaba_tencent.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: ConfigClientMain
 * @Desc:
 * @Author: Chen Yong
 * @Date: 2020-05-13 10:32
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain.class, args);
    }
}
