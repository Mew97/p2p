package com.p2p.commons.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p2p.commons.entity.WithdrawRecord;
import com.p2p.commons.mapper.WithdrawRecordMapper;
import com.p2p.commons.service.IWithdrawRecordService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 提现记录表 服务实现类
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Service
public class WithdrawRecordServiceImpl extends ServiceImpl<WithdrawRecordMapper, WithdrawRecord> implements IWithdrawRecordService {

}
