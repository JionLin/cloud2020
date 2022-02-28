package com.guigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * @author johnny
 * @Classname ReceiveMessageListenerController
 * @Description
 * @Date 2022/2/28 5:28 下午
 */
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {


    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String>message){
        System.out.println("消费者1号,----->接收到的消息: "+message.getPayload()+"\t  port: "+serverPort);
    }
}
