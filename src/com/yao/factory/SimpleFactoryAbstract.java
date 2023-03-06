package com.yao.factory;

import com.yao.factory.abstractF.ChicagoPizzaingredientFactory;
import com.yao.factory.abstractF.PizzaIngredientFactory;
import com.yao.factory.abstractF.impl.CheesePizza;
import com.yao.factory.abstractF.Pizza;

public class SimpleFactoryAbstract extends FactoryAbstract {
    @Override
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaingredientFactory();
        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        }
        return null;
    }
}
