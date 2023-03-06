package com.yao.factory.abstractF;

import com.yao.factory.abstractF.ingredient.Cheese;
import com.yao.factory.abstractF.ingredient.Clams;
import com.yao.factory.abstractF.ingredient.Dough;
import com.yao.factory.abstractF.ingredient.Sauce;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Clams clams;
    protected PizzaIngredientFactory pizzaIngredientFactory;


    public abstract void prepare();

    public void bake() {
        System.out.println("pizzaIngredientFactory bake()");
    }
    public void cut() {
        System.out.println("pizzaIngredientFactory cut()");
    }
    public void box() {
        System.out.println("pizzaIngredientFactory box()");
    }
}
