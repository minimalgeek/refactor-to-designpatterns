package com.csmastery.abstractfactory.product;

public class TomatoBase implements Base {
    @Override
    public String getName() {
        return "tomato";
    }

    @Override
    public int getCalories() {
        return 50;
    }
}
