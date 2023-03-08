package com.yao.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        TargetImpl target = new TargetImpl();
        target.prepare();
        target.execute();
        Adapter adapter = new Adapter(new Adaptee());

        adapter.prepare();
        adapter.execute();
    }
}
