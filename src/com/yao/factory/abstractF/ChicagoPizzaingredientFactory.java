package com.yao.factory.abstractF;

import com.yao.factory.abstractF.ingredient.Cheese;
import com.yao.factory.abstractF.ingredient.Clams;
import com.yao.factory.abstractF.ingredient.Dough;
import com.yao.factory.abstractF.ingredient.Sauce;
import com.yao.factory.abstractF.ingredient.impl.FreshClams;
import com.yao.factory.abstractF.ingredient.impl.MarinaraSauce;
import com.yao.factory.abstractF.ingredient.impl.ReggianoCheese;
import com.yao.factory.abstractF.ingredient.impl.ThinCrustDough;

public class ChicagoPizzaingredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
