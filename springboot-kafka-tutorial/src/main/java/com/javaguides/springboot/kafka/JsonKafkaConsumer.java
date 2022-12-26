package com.javaguides.springboot.kafka;

import com.javaguides.springboot.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics="java-guides-json", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Message received: %s", user.toString()));
    }
}
