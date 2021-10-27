package com.met.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-eureka-feign-client")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
}
