package com.yao.bridge.impl;

import com.yao.bridge.IPayMode;

//密码交易实现类
public class PayCypher implements IPayMode {
    @Override
    public boolean security(String uId) {
        System.out.println("密码交易成功,id:" + uId);
        return true;
    }
}
