package com.atguigu.springcloug.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author johnny
 * @Classname StorageDao
 * @Description
 * @Date 2022/3/10 2:02 下午
 */
@Mapper
public interface StorageDao {

    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
