package com.yao.factory.abstractF.ingredient.impl;

import com.yao.factory.abstractF.ingredient.Clams;

//新鲜蛤蜊
public class FreshClams implements Clams {
    @Override
    public void description() {
        System.out.println("FreshClams");
    }
}
