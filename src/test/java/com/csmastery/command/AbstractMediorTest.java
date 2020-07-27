package com.csmastery.command;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public abstract class AbstractMediorTest extends AbstractWaiterTest {
  @Test
  public void orderStartsCooking() {
    iWaiter.makeOrder();
    assertThat(baos.toString()).isEqualToIgnoringWhitespace("Cooking soup Cooking steak Cooking some potatoes");
  }
}