package at.guigu.springcloud.alibaba.controller;

import at.guigu.springcloud.alibaba.service.FlowLimitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author johnny
 * @Classname FlowLimitController
 * @Description
 * @Date 2022/3/3 11:34 上午
 */

@RestController
@Slf4j
public class FlowLimitController {

    @Autowired
    private FlowLimitService flowLimitService;

    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "\t" + "...testB");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "------testB";
    }

    @GetMapping("/testc")
    public String testc() {


        return flowLimitService.testc();
    }

    @GetMapping("/testd")
    public String testd() {
        return flowLimitService.testc();
    }

}
