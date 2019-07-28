package com.p2p.commons.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p2p.commons.entity.BidsList;
import com.p2p.commons.mapper.BidsListMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 发标待审表 服务实现类
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Service
public class BidsListServiceImpl extends ServiceImpl<BidsListMapper, BidsList> implements IService<BidsList> {

    /**
     * <p>
     * 发标待审表 服务类
     * </p>
     *
     * @author zhu
     * @since 2019-07-18
     */
    public static interface IBidsListService extends IService<BidsList> {

    }
}
