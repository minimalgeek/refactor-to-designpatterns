package com.csmastery.abstractfactory.product;

public class ThinDough implements Dough {
    @Override
    public String getName() {
        return "thin";
    }

    @Override
    public int getCalories() {
        return 50;
    }
}
