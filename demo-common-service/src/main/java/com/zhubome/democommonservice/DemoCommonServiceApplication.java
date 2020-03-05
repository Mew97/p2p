package com.zhubome.democommonservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhubome.democommonservice.mapper")
public class DemoCommonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCommonServiceApplication.class, args);
    }

}
