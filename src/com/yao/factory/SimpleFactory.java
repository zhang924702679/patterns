package com.yao.factory;

import com.yao.factory.pizza.Pizza;
import com.yao.factory.pizza.simple.CheesePizza;
import com.yao.factory.pizza.simple.ClamPizza;
import com.yao.factory.pizza.simple.PepperoniPizza;
import com.yao.factory.pizza.simple.VeggiePizza;

public class SimpleFactory {

    private Pizza pizza;
    public Pizza createPizza(String pizzType) {
        if ("1".equals(pizzType)) {
            return new CheesePizza();
        }
        if ("2".equals(pizzType)) {
            return new ClamPizza();
        }
        if ("3".equals(pizzType)) {
            return new PepperoniPizza();
        }
        if ("4".equals(pizzType)) {
            return new VeggiePizza();
        }
        return null;
    }
}
