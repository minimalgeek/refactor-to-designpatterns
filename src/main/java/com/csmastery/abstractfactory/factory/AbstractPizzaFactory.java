package com.csmastery.abstractfactory.factory;

import com.csmastery.abstractfactory.product.Base;
import com.csmastery.abstractfactory.product.Dough;
import com.csmastery.abstractfactory.product.Topping;

public interface AbstractPizzaFactory {
    Dough createDough();

    Base createBase();

    Topping createTopping();
}
