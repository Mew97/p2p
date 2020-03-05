package com.zhubome.sca.mybatis.service.impl;

import com.zhubome.sca.mybatis.entity.User;
import com.zhubome.sca.mybatis.mapper.UserMapper;
import com.zhubome.sca.mybatis.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mew
 * @since 2020-03-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
