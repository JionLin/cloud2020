package at.guigu.springcloud.alibaba.service.impl;

import at.guigu.springcloud.alibaba.service.FlowLimitService;
import org.springframework.stereotype.Service;

/**
 * @author johnny
 * @Classname FlowLimitServiceimpl
 * @Description
 * @Date 2022/3/3 6:03 下午
 */
@Service
public class FlowLimitServiceimpl implements FlowLimitService {
    @Override
    public String testc() {
        return "12";
    }
}
