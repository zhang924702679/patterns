package com.yao.factory.pizza.method;

import com.yao.factory.pizza.Pizza;
public class NYClamPizza implements Pizza {

    public void prepare() {
        System.out.println("NYClamPizza prepare()");
    }

    public void bake() {
        System.out.println("NYClamPizza bake()");
    }

    public void cut() {
        System.out.println("NYClamPizza cut()");
    }

    public void box() {
        System.out.println("NYClamPizza box()");
    }
}
