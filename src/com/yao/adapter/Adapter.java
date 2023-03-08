package com.yao.adapter;

public class Adapter implements Target{

    private Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void prepare() {
        adaptee.prepare1();
        System.out.println("调用方法进行数据整合");
        adaptee.prepare2();
        adaptee.prepare3();
    }

    @Override
    public void execute() {
        adaptee.doingSomething();
    }
}
