package com.lesson.activemq.controller;

import com.lesson.activemq.domain.Message;
import com.lesson.activemq.jms.JmsProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduceMessageController {

    private final JmsProducer producer;

    public ProduceMessageController(JmsProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/api/message")
    public String sendMessage(@RequestBody Message message) {
        producer.sendMessage(String.format("Message: %s", message.getText()));
        return message.getText();
    }
}
