package com.alibaba_tencent.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosSentinelFeignOrderMain {

    public static void main(String[] args) {
        SpringApplication.run(NacosSentinelFeignOrderMain.class, args);
    }
}
