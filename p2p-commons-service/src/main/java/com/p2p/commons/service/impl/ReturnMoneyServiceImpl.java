package com.p2p.commons.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p2p.commons.entity.ReturnMoney;
import com.p2p.commons.mapper.ReturnMoneyMapper;
import com.p2p.commons.service.IReturnMoneyService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 待还款记录表 服务实现类
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Service
public class ReturnMoneyServiceImpl extends ServiceImpl<ReturnMoneyMapper, ReturnMoney> implements IReturnMoneyService {

}
