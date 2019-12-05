package com.gupaoedu.service.client.kafka;

import com.gupaoedu.service.client.entity.Person;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"kafka-stream"})
    public void receive(Person person)
    {
        System.out.println(person);

    }

}
