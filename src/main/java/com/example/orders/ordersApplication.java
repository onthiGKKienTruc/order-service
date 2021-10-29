package com.example.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
public class ordersApplication {
    public static void main(String[] args) {
        SpringApplication.run(ordersApplication.class, args);
    }
}
