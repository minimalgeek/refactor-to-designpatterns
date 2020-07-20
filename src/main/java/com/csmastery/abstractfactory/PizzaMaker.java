package com.csmastery.abstractfactory;

public class PizzaMaker {
  
  public Pizza makePizza(PizzaType type) {
    return new Pizza(type);
  }

}