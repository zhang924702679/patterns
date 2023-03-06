package com.yao.factory;

import com.yao.factory.pizza.Pizza;
import com.yao.factory.pizza.method.ChicagoCheesePizza;
import com.yao.factory.pizza.method.ChicagoClamPizza;
import com.yao.factory.pizza.method.ChicagoPepperoniPizza;
import com.yao.factory.pizza.method.ChicagoVeggiePizza;

public class ChicagoSimpleFactoryMethod extends SimpleFactoryMethod{
    @Override
    protected Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        } else if (pizzaType.equals("clam")) {
            pizza = new ChicagoClamPizza();
        } else if (pizzaType.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        }
        return pizza;
    }
}
