package com.gupaoedu.service.server.kafka;


import com.gupaoedu.service.server.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@EnableAutoConfiguration
@EnableDiscoveryClient
@RestController
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(KafkaProducer.class, args);
    }

    @GetMapping("/person")
    public Person getPerson(String name)
    {
        Person person = new Person();
        person.setId(System.currentTimeMillis());
        person.setName(name);
        kafkaTemplate.send("kafka-stream", person);
        return person;

    }


}
