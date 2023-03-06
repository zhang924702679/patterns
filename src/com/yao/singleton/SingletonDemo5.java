package com.yao.singleton;

import java.util.concurrent.atomic.AtomicReference;

public class SingletonDemo5 {

    //使用原子类生成单例模式
    //利用CAS的忙等算法,没有传统加锁带来的线程切换和等待,执行效率更高
    //CAS成也忙等败也忙等 如果没有获取到数据 会进入死循环状态 需要额外注意
    private static final AtomicReference<SingletonDemo5> REFERENCE_INSTANCE = new AtomicReference<>();

    private SingletonDemo5() {

    }

    public static SingletonDemo5 getInstance() {
        for(;;) {
            SingletonDemo5 singletonDemo5 = REFERENCE_INSTANCE.get();
            if (singletonDemo5 != null) {
                return singletonDemo5;
            }
            REFERENCE_INSTANCE.compareAndSet(null, new SingletonDemo5());
            return REFERENCE_INSTANCE.get();
        }
    }
}
