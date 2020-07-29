package com.csmastery.abstractfactory.product;

public class SourCreamBase implements Base {
    @Override
    public String getName() {
        return "sour cream";
    }

    @Override
    public int getCalories() {
        return 100;
    }
}
