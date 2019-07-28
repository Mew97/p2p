package com.p2p.commons.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * <p>
 * 发标待审表
 * </p>
 *
 * @author zhu
 * @since 2019-07-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BidsList implements Serializable {

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
    private Long userId;

    /**
     * 借款标题
     */
    @TableField("borrow_title")
    private String borrowTitle;

    /**
     * 借款金额
     */
    @TableField("borrow_money")
    private Double borrowMoney;

    /**
     * 已筹金额
     */
    @TableField("had_borrow")
    private Double hadBorrow;

    /**
     * 利率
     */
    @TableField("Interest_rate")
    private BigDecimal interestRate;

    /**
     * 借款期限
     */
    @TableField("borrow_deadline")
    private Integer borrowDeadline;

    /**
     * 还款方式
     */
    @TableField("repayment_way")
    private String repaymentWay;

    /**
     * 借款进度
     */
    @TableField("borrow_plan")
    private BigDecimal borrowPlan;

    /**
     * 发布时间
     */
    @TableField("publish_time")
    private LocalDate publishTime;

    /**
     * 类型
     */
    @TableField("type")
    private String type;

    /**
     * 状态(发标待审/招标/流标/满标复审)
     */
    @TableField("state")
    private String state;

    /**
     * 推荐状态
     */
    @TableField("recommend_state")
    private String recommendState;


}
