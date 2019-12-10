package com.gupaoedu.service.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@SpringBootApplication
@EnableBinding(Sink.class)
public class EchoServiceServerBootstrap {


    @GetMapping(value = "/echo/{message}")
    public String callEcho(@PathVariable String message) {
        return "hello " + message;
    }

    public static void main(String[] args) {
        SpringApplication.run(EchoServiceServerBootstrap.class, args);
    }



}
