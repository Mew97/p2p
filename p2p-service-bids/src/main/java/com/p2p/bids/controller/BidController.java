package com.p2p.bids.controller;

import com.p2p.bids.vo.Bids;
import com.p2p.commons.entity.BidsList;
import com.p2p.commons.mapper.BidsListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bids")
public class BidController {

    @Autowired
    private BidsListMapper bidsListMapper;

    @GetMapping("{borrowMoney}")
    public Double bids(@PathVariable double borrowMoney){
        final BidsList bidsList = bidsListMapper.selectById(borrowMoney);
        if (bidsList == null){
            return null;
        }else {
            return bidsList.getBorrowMoney();
        }
    }

    @GetMapping("bidsList")
    public Bids bidsList(){

        final Bids bids = new Bids();

        bids.setBorrowTitle("花钱搞事");

        bids.setBorrowMoney(10);

        bids.setInterestRate(12.0);

        bids.setBorrowDeadline(5);

        bids.setRepaymentWay("等额本息");

        bids.setBorrowPlan(20.0);

        return bids;
    }
}
