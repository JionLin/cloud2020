package com.atguigu.springcloug.alibaba.controller;

import com.atguigu.springcloug.alibaba.domain.CommonResult;
import com.atguigu.springcloug.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author johnny
 * @Classname StorageController
 * @Description
 * @Date 2022/3/10 2:05 下午
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}