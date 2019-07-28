package com.p2p.commons.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p2p.commons.entity.UsersCashRecord;
import com.p2p.commons.mapper.UsersCashRecordMapper;
import com.p2p.commons.service.IUsersCashRecordService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资金对账表 服务实现类
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Service
public class UsersCashRecordServiceImpl extends ServiceImpl<UsersCashRecordMapper, UsersCashRecord> implements IUsersCashRecordService {

}
