package com.p2p.commons.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p2p.commons.entity.UsersPoint;
import com.p2p.commons.mapper.UsersPointMapper;
import com.p2p.commons.service.IUsersPointService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 积分列表 服务实现类
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Service
public class UsersPointServiceImpl extends ServiceImpl<UsersPointMapper, UsersPoint> implements IUsersPointService {

}
