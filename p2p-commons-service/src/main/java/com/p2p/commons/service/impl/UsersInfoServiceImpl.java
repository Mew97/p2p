package com.p2p.commons.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p2p.commons.entity.UsersInfo;
import com.p2p.commons.mapper.UsersInfoMapper;
import com.p2p.commons.service.IUsersInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户详细信息表 服务实现类
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Service
public class UsersInfoServiceImpl extends ServiceImpl<UsersInfoMapper, UsersInfo> implements IUsersInfoService {

}
