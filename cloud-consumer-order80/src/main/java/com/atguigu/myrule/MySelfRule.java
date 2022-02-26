package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author johnny
 * @Classname MySelfRule
 * @Description
 * @Date 2022/2/23 10:10 上午
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule getSelfRule(){
        return new RandomRule();
    }
}
