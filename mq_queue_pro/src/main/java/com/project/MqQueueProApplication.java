package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MqQueueProApplication {

    public static void main(String[] args) {
        System.out.println("asdfd");
        SpringApplication.run(MqQueueProApplication.class, args);
    }

}
