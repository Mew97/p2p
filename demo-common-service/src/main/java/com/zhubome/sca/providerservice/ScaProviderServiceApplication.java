package com.zhubome.sca.providerservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.zhubome.sca"}) // 扫描所有项目bean
@EnableDiscoveryClient
@MapperScan("com.zhubome.sca.mybatis.mapper")
public class ScaProviderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScaProviderServiceApplication.class, args);
    }
}
