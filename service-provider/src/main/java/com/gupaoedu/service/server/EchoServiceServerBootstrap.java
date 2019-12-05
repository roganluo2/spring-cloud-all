package com.gupaoedu.service.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@EnableDiscoveryClient
@RestController
public class EchoServiceServerBootstrap {


    @GetMapping(value = "/echo/{message}")
    public String callEcho(@PathVariable String message) {
        return "hello " + message;
    }

    public static void main(String[] args) {
        SpringApplication.run(EchoServiceServerBootstrap.class, args);
    }


}
