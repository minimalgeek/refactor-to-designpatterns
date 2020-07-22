package com.csmastery.abstractfactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class PizzaMakerTest {

  private PizzaMaker pizzaMaker;

  @BeforeEach
  public void init() {
    pizzaMaker = new PizzaMaker();
  }

  @Test
  public void makeSongokuPizza() {
    Pizza pizza = pizzaMaker.makePizza(PizzaType.SONGOKU);
    assertThat(pizza.generateDescription())
        .isEqualTo("This pizza has thick dough, tomato base and ham, mushroom and cheese toppings");
    assertThat(pizza.calculateCalories()).isEqualTo(300);
  }

  @Test
  public void makeFourCheesePizza() {
    Pizza pizza = pizzaMaker.makePizza(PizzaType.FOUR_CHEESE);
    assertThat(pizza.generateDescription())
        .isEqualTo("This pizza has thick dough, sour cream base and four cheese toppings");
    assertThat(pizza.calculateCalories()).isEqualTo(400);
  }

  @Test
  public void makeNapoletanaPizza() {
    Pizza pizza = pizzaMaker.makePizza(PizzaType.NAPOLETANA);
    assertThat(pizza.generateDescription()).isEqualTo("This pizza has thin dough, tomato base and cheese toppings");
    assertThat(pizza.calculateCalories()).isEqualTo(150);
  }

  @Test
  public void throwsExceptionOnNullType() {
    assertThatThrownBy(() -> pizzaMaker.makePizza(null)).isInstanceOf(IllegalArgumentException.class);
  }
}