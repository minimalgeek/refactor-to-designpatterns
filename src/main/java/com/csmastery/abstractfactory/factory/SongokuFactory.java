package com.csmastery.abstractfactory.factory;

import com.csmastery.abstractfactory.product.*;

public class SongokuFactory implements AbstractPizzaFactory {
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Base createBase() {
        return new TomatoBase();
    }

    @Override
    public Topping createTopping() {
        return new SongokuTopping();
    }
}
