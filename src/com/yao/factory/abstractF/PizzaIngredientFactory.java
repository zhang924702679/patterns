package com.yao.factory.abstractF;

import com.yao.factory.abstractF.ingredient.Cheese;
import com.yao.factory.abstractF.ingredient.Clams;
import com.yao.factory.abstractF.ingredient.Dough;
import com.yao.factory.abstractF.ingredient.Sauce;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Clams createClams();
}
