package com.yao.bridge.impl;

import com.yao.bridge.IPayMode;

//指纹交易实现类
public class PayFingerprintMode implements IPayMode {
    @Override
    public boolean security(String uId) {
        System.out.println("刷脸支付成功,id:" + uId);
        return true;
    }
}
