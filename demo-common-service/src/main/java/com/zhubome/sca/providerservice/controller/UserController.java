package com.zhubome.sca.providerservice.controller;


import com.zhubome.sca.mybatis.entity.User;
import com.zhubome.sca.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <p>
`   1 *  前端控制器
 * </p>
 *
 * @author mew
 * @since 2020-03-05
 */
@RestController
public class UserController {

    @Autowired
    private IUserService iUserService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/get")
    public List<User> getUser(){
        return iUserService.list();
    }

    @GetMapping
    public String getPort() throws InterruptedException {
//        TimeUnit.MILLISECONDS.sleep(200); //模拟数据处理时间
        return "被调用的服务端口：" + this.port;
    }

    // 接受form或者url形式参数
    @PostMapping("/form")
    public User printUser2(User user){
        return user;
    }

    // 接受json格式参数
    @PostMapping("/json")
    public User printUser1(@RequestBody User user){
        return user;
    }

}

