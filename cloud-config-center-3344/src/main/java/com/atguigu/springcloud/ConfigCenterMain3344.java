package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author johnny merge incoming changes into the current branch
 * rebase the current branch on top of incoming changes
 * @Classname ConfigCenterMain3344
 * @Description
 * @Date 2022/2/24 5:56 下午
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344
{
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }
}
