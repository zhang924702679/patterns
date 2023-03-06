package com.yao.factory.pizza.method;

import com.yao.factory.pizza.Pizza;
public class ChicagoVeggiePizza implements Pizza {

    public void prepare() {
        System.out.println("ChicagoVeggiePizza prepare()");
    }

    public void bake() {
        System.out.println("ChicagoVeggiePizza bake()");
    }

    public void cut() {
        System.out.println("ChicagoVeggiePizza cut()");
    }

    public void box() {
        System.out.println("ChicagoVeggiePizza box()");
    }
}
