package com.atguigu.springcloug.alibaba.service;

/**
 * @author johnny
 * @Classname StorageService
 * @Description
 * @Date 2022/3/10 2:04 下午
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
