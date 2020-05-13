package com.alibaba_tencent.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: StreamRabbitMqMain
 * @Desc:
 * @Author: Chen Yong
 * @Date: 2020-05-13 16:14
 */
@SpringBootApplication
public class StreamRabbitMqMain {

    public static void main(String[] args) {
        SpringApplication.run(StreamRabbitMqMain.class, args);
    }
}
