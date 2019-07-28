package com.p2p.commons.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 提现记录表
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WithdrawRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableField("id")
    private Long id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private String userId;

    /**
     * 提现账号
     */
    @TableField("withdraw_account")
    private Long withdrawAccount;

    /**
     * 提现银行
     */
    @TableField("withdraw_bank")
    private String withdrawBank;

    /**
     * 支行
     */
    @TableField("branch")
    private String branch;

    /**
     * 提现总额
     */
    @TableField("withdraw_rental")
    private Double withdrawRental;

    /**
     * 到账金额
     */
    @TableField("total_account")
    private Double totalAccount;

    /**
     * 手续费
     */
    @TableField("poundage")
    private Double poundage;

    /**
     * 红包折扣
     */
    @TableField("red_packet")
    private Double redPacket;

    /**
     * 提现时间
     */
    @TableField("withdraw_time")
    private LocalDate withdrawTime;

    /**
     * 状态
     */
    @TableField("status")
    private String status;


}
