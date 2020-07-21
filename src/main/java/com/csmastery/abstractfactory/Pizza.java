package com.csmastery.abstractfactory;

import com.csmastery.abstractfactory.product.Base;
import com.csmastery.abstractfactory.product.Dough;
import com.csmastery.abstractfactory.product.Topping;

public class Pizza {

  private static final String DESCRIPTION_BASE = "This pizza has %s dough, %s base and %s toppings";

  private Dough dough;
  private Topping topping;
  private Base base;

  public Pizza(Dough dough, Topping topping, Base base) {
    this.dough = dough;
    this.topping = topping;
    this.base = base;
  }


  public String generateDescription() {
    return String.format(DESCRIPTION_BASE, this.dough.getName(), this.base.getName(), this.topping.getName());
  }

  public int calculateCalories() {
    return this.dough.getCalories() + this.base.getCalories() + this.topping.getCalories();
  }

}