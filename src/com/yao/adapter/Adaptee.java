package com.yao.adapter;

public class Adaptee {

    //需要适配的接口
    public void prepare1() {
        System.out.println("Adaptee prepare1()");
    }
    public void prepare2() {
        System.out.println("Adaptee prepare2()");
    }
    public void prepare3() {
        System.out.println("Adaptee prepare3()");
    }
    public void doingSomething() {
        System.out.println("Adaptee doingSomething()");
    }
}
