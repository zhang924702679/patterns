package com.yao.bridge;

import java.math.BigDecimal;

import com.yao.bridge.impl.PayCypher;
import com.yao.bridge.impl.WxPay;

public class BridgeTest {

    public static void main(String[] args) {
        WxPay wxPay = new WxPay(new PayCypher());
        String transfer = wxPay.transfer("1111wx", "032", new BigDecimal(100));
        System.out.println(transfer);

    }
}
