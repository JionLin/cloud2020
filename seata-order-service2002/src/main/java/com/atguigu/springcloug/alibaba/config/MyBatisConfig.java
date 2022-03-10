package com.atguigu.springcloug.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author johnny
 * @Classname MyBatisConfig
 * @Description
 * @Date 2022/3/10 2:06 下午
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
