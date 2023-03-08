package com.yao.bridge.impl;

import java.math.BigDecimal;

import com.yao.bridge.IPayMode;
import com.yao.bridge.Pay;

public class ZfbPay extends Pay {
    public ZfbPay(IPayMode iPayMode) {
        super(iPayMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        boolean security = iPayMode.security(uId);
        if (!security) {
            return "0001";
        }
        return "0000";
    }
}
