package com.csmastery.abstractfactory;

public class PizzaMaker {
  
  public Pizza makePizza(PizzaType type) {
    if (type == null) {
      throw new IllegalArgumentException("Please provide a known pizza type");
    }
    return new Pizza(type.getFactory().createDough(), type.getFactory().createTopping(), type.getFactory().createBase());
  }

}