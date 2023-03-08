package com.yao.bridge.impl;

import com.yao.bridge.IPayMode;

//刷脸验证
public class PayFaceMode implements IPayMode {

    @Override
    public boolean security(String uId) {
        System.out.println("刷脸验证通过,id:" + uId);
        return true;
    }
}
