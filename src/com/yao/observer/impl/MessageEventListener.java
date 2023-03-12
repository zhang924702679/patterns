package com.yao.observer.impl;

import com.yao.observer.EventListener;
import com.yao.observer.LotteryResult;

public class MessageEventListener implements EventListener {
    @Override
    public void doEvent(LotteryResult lotteryResult) {
        System.out.println("给用户" + lotteryResult.getUid() + "发送短信通知(短信):" + lotteryResult.getInit());
    }
}
