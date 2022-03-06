package at.guigu.springcloud.alibaba.controller;

import at.guigu.springcloud.alibaba.service.FlowLimitService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        log.info("测试异常比例....");
        int i=10/0;
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


    @GetMapping("/testHotKey")
//    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    @SentinelResource(value = "testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2)
    {
        //int age = 10/0;
        return "------testHotKey";
    }
    public String deal_testHotKey (String p1, String p2, BlockException exception)
    {
        return "------deal_testHotKey,o(╥﹏╥)o";  //sentinel系统默认的提示：Blocked by Sentinel (flow limiting)
    }
}
