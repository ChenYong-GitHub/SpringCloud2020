package com.alibaba_tencent.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: AlibabaNacosConsumerOrderMain
 * @Desc:
 * @Author: Chen Yong
 * @Date: 2020-05-14 16:26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaNacosConsumerOrderMain {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosConsumerOrderMain.class, args);
    }
}
