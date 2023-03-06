package com.yao.factory.abstractF.ingredient.impl;

import com.yao.factory.abstractF.ingredient.Cheese;

public class MozzarellaCheese implements Cheese {
    @Override
    public void description() {
        System.out.println("MozzarellaCheese");
    }
}
