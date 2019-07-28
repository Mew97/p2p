package com.p2p;




import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.p2p.commons.mapper")
public class P2pServiceRegApplication {

    public static void main(String[] args) {

        SpringApplication.run(P2pServiceRegApplication.class, args);
    }
}
