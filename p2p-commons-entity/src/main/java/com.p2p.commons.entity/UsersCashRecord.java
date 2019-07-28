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
 * 资金对账表
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UsersCashRecord implements Serializable {

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
     * 资金总额
     */
    @TableField("total_funds")
    private Long totalFunds;

    /**
     * 可用资金
     */
    @TableField("available_funds")
    private Long availableFunds;

    /**
     * 冻结资金
     */
    @TableField("frozen_funds")
    private Long frozenFunds;

    /**
     * 待收资金
     */
    @TableField("pending_funds")
    private Long pendingFunds;

    /**
     * 待还本金
     */
    @TableField("repaid_principal")
    private Long repaidPrincipal;

    /**
     * 待还利息
     */
    @TableField("repaid_interest")
    private Long repaidInterest;

    /**
     * 充值资金(历史累计)
     */
    @TableField("prepaid_funds")
    private Long prepaidFunds;

    /**
     * 提现资金(历史累计)
     */
    @TableField("withdrawal_funds")
    private Long withdrawalFunds;

    /**
     * 投标(历史累计)
     */
    @TableField("bidding")
    private Long bidding;

    /**
     * 借款奖励资金(历史累计)
     */
    @TableField("loan_incentive_funds")
    private Long loanIncentiveFunds;

    /**
     * 系统扣费(历史累计)
     */
    @TableField("system_deduction_fees")
    private Long systemDeductionFees;

    /**
     * 推广奖励(历史累计)
     */
    @TableField("promotion_incentives")
    private Long promotionIncentives;

    /**
     * VIP扣费(历史累计)
     */
    @TableField("vip_deduction_fees")
    private Long vipDeductionFees;


}
