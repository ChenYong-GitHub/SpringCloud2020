package com.alibaba_tencent.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: ConsumerFeignHystrixMain
 * @Desc:
 * @Author: Chen Yong
 * @Date: 2020-05-09 14:28
 */
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class ConsumerFeignHystrixMain {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignHystrixMain.class, args);
    }
}
