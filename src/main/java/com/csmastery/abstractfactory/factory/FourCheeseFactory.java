package com.csmastery.abstractfactory.factory;

import com.csmastery.abstractfactory.product.*;

public class FourCheeseFactory implements AbstractPizzaFactory {
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Base createBase() {
        return new SourCreamBase();
    }

    @Override
    public Topping createTopping() {
        return new FourCheeseTopping();
    }
}
