package com.p2p.controller;

import com.p2p.commons.dto.AbstractBaseResult;
import com.p2p.commons.dto.BaseResultFactory;
import com.p2p.commons.dto.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping("records/{id}")
    public AbstractBaseResult getById(@PathVariable long id){
        return null;
    }

}
