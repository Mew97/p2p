package com.p2p.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.p2p.VO.MyUser;
import com.p2p.commons.entity.Users;
import com.p2p.commons.mapper.UsersMapper;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("reg")
public class RegController {
    @Autowired
    private UsersMapper usersMapper;


    @GetMapping("{id}")
    public String reg(@PathVariable long id){
        Users users = usersMapper.selectById(id);
        if (users == null){
            return null;
        }else {
            return users.getUsername();
        }
    }

    @GetMapping("test/{current}/{size}")
    public IPage<Users> redisTest(@PathVariable int current,@PathVariable int size) {

        Page<Users> usersPage = new Page<>(current,size);

        return usersMapper.selectPageVo(usersPage);


    }
}
