package com.yao.singleton;

public class SingletonDemo4 {

    //静态内部类实现单例模式
    //这种方法类似于饿汉模式 线程安全 延迟加载
    public static class SingletonHolder {
        private static SingletonDemo4 SINGLETON_DEMO = new SingletonDemo4();
    }

    private SingletonDemo4() {

    }

    public static SingletonDemo4 getInstance() {
        return SingletonHolder.SINGLETON_DEMO;
    }
}
