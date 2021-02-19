package com.lesson.activemq.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class JmsConsumer {

    Logger logger = LoggerFactory.getLogger(JmsConsumer.class);

    @JmsListener(destination = "my.topic")
    public void onMessage(String message) {
        logger.info("Received: {}", message);
    }
}
