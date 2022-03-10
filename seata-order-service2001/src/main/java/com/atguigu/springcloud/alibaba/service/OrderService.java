package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.Order;

/**
 * @author johnny
 * @Classname OrderService
 * @Description
 * @Date 2022/3/10 9:43 上午
 */
public interface OrderService
{
    void create(Order order);
}
