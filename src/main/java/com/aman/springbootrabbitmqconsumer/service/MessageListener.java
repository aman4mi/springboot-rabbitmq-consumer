package com.aman.springbootrabbitmqconsumer.service;

import com.aman.springbootrabbitmqconsumer.configuration.MQConfig;
import com.aman.springbootrabbitmqconsumer.model.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println("From RabbitMQ ======== "+message);
    }
}
