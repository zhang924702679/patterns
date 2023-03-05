package com.yao.singleton;

public class SingletonDemo2 {

    //实现懒汉式
    // 线程不安全 效率相对低 可以延迟加载
    //只有在第一次调用的时候才会初始化一个实例
    private static SingletonDemo2 SINGLETON_DEMO;

    private SingletonDemo2() {

    }

    public static SingletonDemo2 getInstance() {
        if (SINGLETON_DEMO == null) {
            SINGLETON_DEMO = new SingletonDemo2();
        }
        return SINGLETON_DEMO;
    }
}
