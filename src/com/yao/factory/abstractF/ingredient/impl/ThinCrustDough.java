package com.yao.factory.abstractF.ingredient.impl;

import com.yao.factory.abstractF.ingredient.Dough;

public class ThinCrustDough implements Dough {
    @Override
    public void description() {
        System.out.println("ThinCrustDough");
    }
}
