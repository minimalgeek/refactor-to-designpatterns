package com.csmastery.abstractfactory.product;

public class SongokuTopping implements Topping {
    @Override
    public String getName() {
        return "ham, mushroom and cheese";
    }

    @Override
    public int getCalories() {
        return 150;
    }
}
