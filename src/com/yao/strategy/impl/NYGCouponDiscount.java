package com.yao.strategy.impl;

import java.math.BigDecimal;

import com.yao.strategy.ICouponDiscount;

public class NYGCouponDiscount implements ICouponDiscount<Double> {
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
