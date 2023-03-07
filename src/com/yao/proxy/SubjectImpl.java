package com.yao.proxy;

public class SubjectImpl implements Subject{
    @Override
    public void request() {
        System.out.println("执行SubjectImpl.request()");
    }
}
