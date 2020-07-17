package com.csmastery.command;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public abstract class AbstractJuniorTest extends AbstractWaiterTest{

  @Test
  public void orderStartsCooking() {
    iWaiter.makeOrder();
    assertThat(baos.toString()).isEqualToIgnoringWhitespace("Cooking soup Cooking pasta");
  }

}