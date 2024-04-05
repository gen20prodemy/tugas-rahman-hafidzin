package com.pos.gen20javaspringbootpos.kafka.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void sendMessage(String topic, String message){
        kafkaTemplate.send(topic, message);
    }

//    public Object sendCost(String topic, Object message){
//        return kafkaTemplate1.send(topic, message);
//    }
}
