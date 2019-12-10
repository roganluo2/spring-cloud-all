package com.gupaoedu.service.server.kafka;

import com.gupaoedu.service.server.entity.Person;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;


@Component
public class KafkaConsumer {

    @StreamListener(Sink.INPUT)
    public void in(Person person) {
        System.out.println(person);
    }

}
