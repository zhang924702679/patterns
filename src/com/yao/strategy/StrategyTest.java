package com.yao.strategy;

import java.math.BigDecimal;

import com.yao.strategy.impl.ZJCouponDiscount;

public class StrategyTest {

    //策略模式测试类
    public static void main(String[] args) {

        Context<Double> context = new Context<Double>(new ZJCouponDiscount());
        BigDecimal discountAmount = context.discountAmount(10D, new BigDecimal(100));
        System.out.println("测试结果：直减优惠后金额:" + discountAmount);
    }
}
