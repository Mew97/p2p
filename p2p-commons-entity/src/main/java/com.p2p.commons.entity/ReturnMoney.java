package com.p2p.commons.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 待还款记录表
 * </p>
 *
 * @author zhu
 * @since 2019-07-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ReturnMoney implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId("id")
    private Long id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private String userId;

    /**
     * 信用积分
     */
    @TableField("credit_score")
    private Long creditScore;

    /**
     * 借款标题
     */
    @TableField("borrow_title")
    private String borrowTitle;

    /**
     * 借款金额
     */
    @TableField("borrow_money")
    private Long borrowMoney;

    /**
     * 年利率
     */
    @TableField("Interest_rate")
    private BigDecimal interestRate;

    /**
     * 投标次数
     */
    @TableField("bids")
    private Long bids;

    /**
     * 借款期限
     */
    @TableField("borrow_deadline")
    private Long borrowDeadline;

    /**
     * 状态
     */
    @TableField("state")
    private String state;


}
