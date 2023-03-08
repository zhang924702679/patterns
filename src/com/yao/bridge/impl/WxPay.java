package com.yao.bridge.impl;

import java.math.BigDecimal;

import com.yao.bridge.IPayMode;
import com.yao.bridge.Pay;

public class WxPay extends Pay {

    public WxPay(IPayMode iPayMode) {
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
