package com.yao.strategy.impl;

import java.math.BigDecimal;

import com.yao.strategy.ICouponDiscount;

public class ZJCouponDiscount  implements ICouponDiscount<Double> {
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) return BigDecimal.ONE;
        return discountAmount;
    }
}
