package com.yao.factory;

import com.yao.factory.pizz.Pizz;
import com.yao.factory.pizz.simple.CheesePizz;

public class SimpleFactory {

    public Pizz createPizza(String pizzType) {
        if ("1".equals(pizzType)) {
            return new CheesePizz();
        }
        return null;
    }
}
