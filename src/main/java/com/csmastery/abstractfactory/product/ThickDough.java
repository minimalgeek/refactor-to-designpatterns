package com.csmastery.abstractfactory.product;

public class ThickDough implements Dough {
    @Override
    public String getName() {
        return "thick";
    }

    @Override
    public int getCalories() {
        return 100;
    }
}
