package com.p2p.commons.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.p2p.commons.entity.SysInfo;
import com.p2p.commons.mapper.SysInfoMapper;
import com.p2p.commons.service.ISysInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统信息表 服务实现类
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Service
public class SysInfoServiceImpl extends ServiceImpl<SysInfoMapper, SysInfo> implements ISysInfoService {

}
