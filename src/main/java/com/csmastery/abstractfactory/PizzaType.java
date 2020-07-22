package com.csmastery.abstractfactory;

import com.csmastery.abstractfactory.factory.AbstractPizzaFactory;
import com.csmastery.abstractfactory.factory.FourCheeseFactory;
import com.csmastery.abstractfactory.factory.NapoletanaFactory;
import com.csmastery.abstractfactory.factory.SongokuFactory;

public enum PizzaType {
  SONGOKU(new SongokuFactory()), FOUR_CHEESE(new FourCheeseFactory()), NAPOLETANA(new NapoletanaFactory());

  private AbstractPizzaFactory factory;

  PizzaType(AbstractPizzaFactory factory) {

    this.factory = factory;
  }

  public AbstractPizzaFactory getFactory() {
    return factory;
  }
}