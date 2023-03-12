package com.yao.observer;

import com.yao.observer.impl.LotteryServiceImpl;

//观察者设计模式测试类
public class ObserverTest {

    public static void main(String[] args) {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("2765789109876");
        System.out.println("测试结果：" + result.toString());
    }
}
