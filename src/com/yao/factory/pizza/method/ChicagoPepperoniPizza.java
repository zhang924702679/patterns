package com.yao.factory.pizza.method;

import com.yao.factory.pizza.Pizza;

public class ChicagoPepperoniPizza implements Pizza {

    public void prepare() {
        System.out.println("ChicagoPepperoniPizza prepare()");
    }

    public void bake() {
        System.out.println("ChicagoPepperoniPizza bake()");
    }

    public void cut() {
        System.out.println("ChicagoPepperoniPizza cut()");
    }

    public void box() {
        System.out.println("ChicagoPepperoniPizza box()");
    }
}
