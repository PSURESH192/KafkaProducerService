package com.springboot.project.kafkaproducerservice.controller;

import com.springboot.project.kafkaproducerservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;

    public static final String TOPIC = "KafkaTopic3";

    @PostMapping("/publish")
    public String producerMessage(@RequestBody User user){
        user.setId(UUID.randomUUID().toString().replace("-", ""));
        kafkaTemplate.send(TOPIC, user);
        return "Published Successfully";
    }
}
