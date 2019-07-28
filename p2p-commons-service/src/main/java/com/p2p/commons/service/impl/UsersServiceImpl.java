package com.p2p.commons.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p2p.commons.entity.Users;
import com.p2p.commons.mapper.UsersMapper;
import com.p2p.commons.service.IUsersService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户列表 服务实现类
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
