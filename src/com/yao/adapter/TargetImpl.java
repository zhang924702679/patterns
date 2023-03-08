package com.yao.adapter;

public class TargetImpl implements Target{
    @Override
    public void prepare() {
        System.out.println("TargetImpl prepare");
    }

    @Override
    public void execute() {
        System.out.println("TargetImpl execute");
    }
}
