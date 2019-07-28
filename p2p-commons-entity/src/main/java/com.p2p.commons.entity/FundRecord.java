package com.p2p.commons.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 资金记录表
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FundRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 交易类型
     */
    @TableField("type")
    private String type;

    /**
     * 总金额
     */
    @TableField("total_amount")
    private Double totalAmount;

    /**
     * 操作金额
     */
    @TableField("operate_amount")
    private Double operateAmount;

    /**
     * 可用金额
     */
    @TableField("available_amount")
    private Double availableAmount;

    /**
     * 冻结金额
     */
    @TableField("freeze_amount")
    private Double freezeAmount;

    /**
     * 待收金额
     */
    @TableField("pending_amount")
    private Double pendingAmount;

    /**
     * 交易对方id
     */
    @TableField("other_side")
    private Long otherSide;

    /**
     * 记录时间
     */
    @TableField("time")
    private String time;

    /**
     * 备注
     */
    @TableField("remarks")
    private String remarks;


}
