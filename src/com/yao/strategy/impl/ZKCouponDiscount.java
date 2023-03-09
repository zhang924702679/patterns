package com.yao.strategy.impl;

import java.math.BigDecimal;

import com.yao.strategy.ICouponDiscount;

public class ZKCouponDiscount implements ICouponDiscount<Double> {
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.multiply(new BigDecimal(couponInfo)).setScale(2, BigDecimal.ROUND_HALF_UP);
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;
        return discountAmount;
    }
}
