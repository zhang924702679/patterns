package com.yao.singleton;

public class SingletonDemo3 {

    //针对懒汉线程不安全的问题 这里增加校验
    private static volatile SingletonDemo3 SINGLETON_DEMO;

    private SingletonDemo3() {

    }

    //使用synchronized加锁 防止多线程调用导致多个实例的出现
    //但是因为是加在方法上所以锁的力度比较大还可以在优化一下
    //注意 这种方法私有变量不需要volatile同步实例状态
    public static synchronized SingletonDemo3 getInstance1() {
        if (SINGLETON_DEMO == null) {
            SINGLETON_DEMO = new SingletonDemo3();
        }
        return SINGLETON_DEMO;
    }

    //可以将synchronized从方法上移动到方法内部,这样锁哥线程会等在第一次判断的时候
    //双重判断是为了第一个线程完成创建之后,其他线程不在回去创建设计的
    //注意 这种方法需要添加volatile 让线程之间的数据相互同步
    public static  SingletonDemo3 getInstance2() {
        if (SINGLETON_DEMO == null) {
            synchronized(SingletonDemo3.class) {
                if (SINGLETON_DEMO == null) {
                    SINGLETON_DEMO = new SingletonDemo3();
                }
            }
        }
        return SINGLETON_DEMO;
    }
}
