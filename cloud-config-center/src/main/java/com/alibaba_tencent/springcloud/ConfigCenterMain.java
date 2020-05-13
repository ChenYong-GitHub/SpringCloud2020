package com.alibaba_tencent.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: ConfigCenterMain
 * @Desc:
 * @Author: Chen Yong
 * @Date: 2020-05-13 9:35
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain.class, args);
    }
}
