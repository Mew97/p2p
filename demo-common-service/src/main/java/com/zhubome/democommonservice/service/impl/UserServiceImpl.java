package com.zhubome.democommonservice.service.impl;

import com.zhubome.democommonservice.entity.User;
import com.zhubome.democommonservice.mapper.UserMapper;
import com.zhubome.democommonservice.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-03-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
