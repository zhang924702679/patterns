package com.yao.bridge;

import java.math.BigDecimal;

public abstract class Pay {

    protected IPayMode iPayMode;

    public Pay() {

    }

    public Pay(IPayMode iPayMode) {
        this.iPayMode = iPayMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

    public void method() {
        System.out.println("没什么卵用的方法");
    }
}
