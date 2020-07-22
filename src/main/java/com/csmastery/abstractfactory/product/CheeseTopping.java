package com.csmastery.abstractfactory.product;

public class CheeseTopping implements Topping {
    @Override
    public String getName() {
        return "cheese";
    }

    @Override
    public int getCalories() {
        return 50;
    }
}
