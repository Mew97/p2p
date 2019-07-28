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
 * 充值记录表
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class RechargeRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 流水号
     */
    @TableField("serial_number")
    private String serialNumber;

    /**
     * 用户id
     */
    @TableField("user_id")
    private String userId;

    /**
     * 类型
     */
    @TableField("type")
    private String type;

    /**
     * 所属银行
     */
    @TableField("bank")
    private String bank;

    /**
     * 充值金额
     */
    @TableField("recharge_amount")
    private Long rechargeAmount;

    /**
     * 费用
     */
    @TableField("cost")
    private Long cost;

    /**
     * 到账金额
     */
    @TableField("arrival_amount")
    private Long arrivalAmount;

    /**
     * 奖励
     */
    @TableField("reward")
    private Long reward;

    /**
     * 充值时间
     */
    @TableField("Prepaid_time")
    private String prepaidTime;

    /**
     * 状态
     */
    @TableField("status")
    private String status;

    /**
     * 银行返回
     */
    @TableField("bank_return")
    private String bankReturn;


}
