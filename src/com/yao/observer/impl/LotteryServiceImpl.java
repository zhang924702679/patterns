package com.yao.observer.impl;

import com.yao.observer.EventManager;
import com.yao.observer.LotteryResult;
import com.yao.observer.LotteryService;
import com.yao.observer.utils.MinibusTargetUtils;

import java.util.Date;

public class LotteryServiceImpl extends LotteryService {
    private MinibusTargetUtils minibusTargetUtils = new MinibusTargetUtils();

    @Override
    public LotteryResult draw(String uId) {
        LotteryResult lotteryResult = doDraw(uId);
        // 需要什么通知就给调用什么方法
        eventManager.notify(EventManager.EventType.Message, lotteryResult);
        return lotteryResult;
    }

    @Override
    protected LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = minibusTargetUtils.lottery(uId);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }
}
