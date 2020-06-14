package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

import java.util.UUID;

@Service
public class SendService {

    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;


    @Autowired
    Queue queue;
    @Autowired
    Topic topic;

    //queue发送消息
    public void sendQueue(){
        jmsMessagingTemplate.convertAndSend(queue,"msg:"+UUID.randomUUID().toString().substring(0,5));

    }

//    @Scheduled(fixedDelay=3000)
    public void sendTopic(){

        jmsMessagingTemplate.convertAndSend(topic,"msg:"+UUID.randomUUID().toString().substring(0,5));
        System.out.println("success");
    }

}
