package com.csmastery.abstractfactory.factory;

import com.csmastery.abstractfactory.product.*;

public class NapoletanaFactory implements AbstractPizzaFactory {
    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Base createBase() {
        return new TomatoBase();
    }

    @Override
    public Topping createTopping() {
        return new CheeseTopping();
    }
}
