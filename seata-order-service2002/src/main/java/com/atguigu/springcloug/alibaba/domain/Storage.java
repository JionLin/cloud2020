package com.atguigu.springcloug.alibaba.domain;

import lombok.Data;

/**
 * @author johnny
 * @Classname Storage
 * @Description
 * @Date 2022/3/10 2:03 下午
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}