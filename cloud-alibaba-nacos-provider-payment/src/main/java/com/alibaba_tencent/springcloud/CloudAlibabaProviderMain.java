package com.alibaba_tencent.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: CloudAlibabaProviderMain
 * @Desc:
 * @Author: Chen Yong
 * @Date: 2020-05-14 15:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaProviderMain {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaProviderMain.class, args);
    }
}
