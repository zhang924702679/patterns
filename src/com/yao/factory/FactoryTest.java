package com.yao.factory;

import com.yao.factory.pizza.Pizza;

public class FactoryTest {

    public static void main(String[] args) {
        SimpleFactoryPizzaStore simpleFactoryPizzaStore = new SimpleFactoryPizzaStore();
        Pizza pizza = simpleFactoryPizzaStore.orderPizza("2");
        System.out.println(pizza);
    }
}
