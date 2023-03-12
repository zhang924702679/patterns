package com.yao.observer.impl;

import com.yao.observer.EventListener;
import com.yao.observer.LotteryResult;

public class MQEventListener implements EventListener {
    @Override
    public void doEvent(LotteryResult lotteryResult) {
        System.out.println("记录用户" + lotteryResult.getUid() + "摇号结果(MQ)" + lotteryResult.getInit());
    }
}
