package com.yao.factory;

import com.yao.factory.pizza.Pizza;
import com.yao.factory.pizza.method.NYCheesePizza;
import com.yao.factory.pizza.method.NYClamPizza;
import com.yao.factory.pizza.method.NYPepperoniPizza;
import com.yao.factory.pizza.method.NYVeggiePizza;

public class NYSimpleFactoryMethod extends SimpleFactoryMethod{
    @Override
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new NYPepperoniPizza();
        } else if (pizzaType.equals("clam")) {
            pizza = new NYClamPizza();
        } else if (pizzaType.equals("veggie")) {
            pizza = new NYVeggiePizza();
        }
        return pizza;
    }
}
