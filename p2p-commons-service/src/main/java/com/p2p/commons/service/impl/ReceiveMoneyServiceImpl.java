package com.p2p.commons.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p2p.commons.entity.ReceiveMoney;
import com.p2p.commons.mapper.ReceiveMoneyMapper;
import com.p2p.commons.service.IReceiveMoneyService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 待收款记录表 服务实现类
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Service
public class ReceiveMoneyServiceImpl extends ServiceImpl<ReceiveMoneyMapper, ReceiveMoney> implements IReceiveMoneyService {

}
