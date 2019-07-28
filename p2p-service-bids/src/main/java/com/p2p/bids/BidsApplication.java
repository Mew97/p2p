package com.p2p.bids;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.p2p.commons.mapper")
@SpringBootApplication()
public class BidsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BidsApplication.class, args);
    }

}
