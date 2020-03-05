package com.zhubome.sca.consumerservice.service;

import com.zhubome.sca.mybatis.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("sca-provider-service")
public interface IGetUserService {
    @GetMapping("/get")
    List<User> feignGet();

    // 负载均衡测试
    @GetMapping
    String feignGet2();
}
