package com.yao.factory.abstractF.ingredient.impl;

import com.yao.factory.abstractF.ingredient.Clams;

//冷冻蛤蜊
public class FrozenClams implements Clams {
    @Override
    public void description() {
        System.out.println("FrozenClams");
    }
}
