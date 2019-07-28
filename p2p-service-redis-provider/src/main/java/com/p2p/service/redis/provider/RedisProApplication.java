package com.p2p.service.redis.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class RedisProApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedisProApplication.class, args);
    }
}
