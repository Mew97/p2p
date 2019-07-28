package com.p2p.commons.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p2p.commons.entity.FundRecord;
import com.p2p.commons.mapper.FundRecordMapper;
import com.p2p.commons.service.IFundRecordService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资金记录表 服务实现类
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Service
public class FundRecordServiceImpl extends ServiceImpl<FundRecordMapper, FundRecord> implements IFundRecordService {

}
