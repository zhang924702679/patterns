package com.yao.factory.pizza.method;

import com.yao.factory.pizza.Pizza;

public class ChicagoCheesePizza implements Pizza {

    public void prepare() {
        System.out.println("ChicagoCheesePizza prepare()");
    }

    public void bake() {
        System.out.println("ChicagoCheesePizza bake()");
    }

    public void cut() {
        System.out.println("ChicagoCheesePizza cut()");
    }

    public void box() {
        System.out.println("ChicagoCheesePizza box()");
    }
}
