package com.csmastery.abstractfactory.product;

public class FourCheeseTopping implements Topping {
    @Override
    public String getName() {
        return "four cheese";
    }

    @Override
    public int getCalories() {
        return 200;
    }
}
