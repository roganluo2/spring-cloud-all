package com.gupaoedu.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("service-provider")
public interface EchoServiceClient {

    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable(name = "message") String message);
}
