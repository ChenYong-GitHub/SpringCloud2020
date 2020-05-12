package com.alibaba_tencent.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: CloudGateway
 * @Desc: Spring Cloud Gateway 启动类
 * @Author: Chen Yong
 * @Date: 2020-05-12 15:02
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayMain {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayMain.class, args);
    }
}
