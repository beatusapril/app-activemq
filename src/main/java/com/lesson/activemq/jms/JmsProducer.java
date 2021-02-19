package com.lesson.activemq.jms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsProducer {

    @Value("${spring.activemq.topic}")
    private String topic;

    private final JmsTemplate jms;

    public JmsProducer(JmsTemplate jms) {
        this.jms = jms;
    }

    public void sendMessage(String message) {
        jms.convertAndSend(topic, message);
    }
}
