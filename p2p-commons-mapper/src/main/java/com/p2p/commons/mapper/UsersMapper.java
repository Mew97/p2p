package com.p2p.commons.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.p2p.commons.entity.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 用户列表 Mapper 接口
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
public interface UsersMapper extends BaseMapper<Users> {

    IPage<Users> selectPageVo(Page page);

}
