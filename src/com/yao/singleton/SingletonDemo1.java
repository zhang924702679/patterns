package com.yao.singleton;

public class SingletonDemo1 {

    //实现饿汉模式
    //线程安全 调用效率高 立即加载
    //一加载就会初始化实例
    private static SingletonDemo1 SINGLETON_DEMO = new SingletonDemo1();

    private SingletonDemo1() {

    }
    public static SingletonDemo1 getInstance() {
        return SINGLETON_DEMO;
    }
}
