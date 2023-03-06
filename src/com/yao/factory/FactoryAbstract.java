package com.yao.factory;

import com.yao.factory.abstractF.Pizza;

public abstract class FactoryAbstract {

    protected abstract Pizza createPizza(String pizzaType);
    protected Pizza orderPizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
