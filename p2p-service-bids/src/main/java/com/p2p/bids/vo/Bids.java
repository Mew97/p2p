package com.p2p.bids.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Bids {

    private String borrowTitle;

    private double borrowMoney;

    private double interestRate;

    private int borrowDeadline;

    private String repaymentWay;

    private double borrowPlan;

}
