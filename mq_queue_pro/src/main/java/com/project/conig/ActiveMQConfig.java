package com.project.conig;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;
import javax.management.MXBean;

@Configuration
public class ActiveMQConfig {

    @Value("${myqueue}")
    private String queueName;
    @Value("${mytopic}")
    private String topicNmae;

    @Bean
    public Queue queue(){
        return new ActiveMQQueue(queueName);
    }

    @Bean
    public Topic topic(){
        return new ActiveMQTopic(topicNmae);
    }
}
