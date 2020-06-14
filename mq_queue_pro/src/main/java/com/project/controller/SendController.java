package com.project.controller;

import com.project.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendController {
    @Autowired
    SendService sendService;

    @RequestMapping("/sendQueue")
    public String  sendQueue(){
        sendService.sendQueue();
        return "send queue success";
    }

    @RequestMapping("/sendTopic")
    public String sendTopic(){
        sendService.sendTopic();
        return "send topic success";
    }
}
