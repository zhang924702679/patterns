package com.yao.factory;

import com.yao.factory.pizza.Pizza;

public class SimpleFactoryPizzaStore {

    private static SimpleFactory SIMPLEFACTORY  = new SimpleFactory();

    public Pizza orderPizza(String pizzType) {
        Pizza pizza = SIMPLEFACTORY.createPizza(pizzType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
