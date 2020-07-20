package com.csmastery.abstractfactory;

public class Pizza {

  private static final String DESCRIPTION_BASE = "This pizza has %s dough, %s base and %s toppings";
  private PizzaType type;

  public Pizza(PizzaType type) {
    this.type = type;
  }

  public String generateDescription() {
    if (type == PizzaType.SONGOKU) {
      return String.format(DESCRIPTION_BASE, "thick", "tomato", "ham, mushroom and cheese");
    } else if (type == PizzaType.FOUR_CHEESE) {
      return String.format(DESCRIPTION_BASE, "thick", "sour cream", "four cheese");
    } else if (type == PizzaType.NAPOLETANA) {
      return String.format(DESCRIPTION_BASE, "thin", "tomato", "cheese");
    }
    throw new IllegalArgumentException("Please provide a known pizza type");
  }

  public int calculateCalories() {
    if (type == PizzaType.SONGOKU) {
      return 100 + 50 + 3 * 50;
    } else if (type == PizzaType.FOUR_CHEESE) {
      return 100 + 100 + 4 * 50;
    } else if (type == PizzaType.NAPOLETANA) {
      return 50 + 50 + 50;
    }
    throw new IllegalArgumentException("Please provide a known pizza type");
  }

}