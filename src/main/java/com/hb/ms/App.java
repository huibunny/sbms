package com.hb.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@RestController
public class App 
{    

    @GetMapping("/health-check")
    public String success() {
        return "success";
    }

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    // https://piotrminkowski.com/2019/10/11/using-new-spring-cloud-load-balancer-in-microservices-communication/
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
