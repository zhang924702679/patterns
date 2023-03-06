package com.yao.factory.pizza.method;

import com.yao.factory.pizza.Pizza;

public class ChicagoClamPizza implements Pizza {

    public void prepare() {
        System.out.println("ChicagoClamPizza prepare()");
    }

    public void bake() {
        System.out.println("ChicagoClamPizza bake()");
    }

    public void cut() {
        System.out.println("ChicagoClamPizza cut()");
    }

    public void box() {
        System.out.println("ChicagoClamPizza box()");
    }
}
