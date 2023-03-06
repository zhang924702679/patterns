package com.yao.factory.abstractF;

import com.yao.factory.abstractF.ingredient.Cheese;
import com.yao.factory.abstractF.ingredient.Clams;
import com.yao.factory.abstractF.ingredient.Dough;
import com.yao.factory.abstractF.ingredient.Sauce;
import com.yao.factory.abstractF.ingredient.impl.FrozenClams;
import com.yao.factory.abstractF.ingredient.impl.MozzarellaCheese;
import com.yao.factory.abstractF.ingredient.impl.PlumTomatoSauce;
import com.yao.factory.abstractF.ingredient.impl.ThickCrustDough;

public class NYPizzaingredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Clams createClams() {
        return new FrozenClams();
    }
}
