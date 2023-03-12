package com.yao.observer;

//事件接口 用于规范事件
public interface EventListener {

    void doEvent(LotteryResult lotteryResult);
}
