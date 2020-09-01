package com.csmastery.command;

import static org.assertj.core.api.Assertions.assertThat;

import com.csmastery.command.order.ICommand;
import com.csmastery.command.order.MediorOrder;
import com.csmastery.command.service.Chef;
import com.csmastery.command.service.Cook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class AbstractMediorTest extends AbstractWaiterTest {

  protected ICommand command;

  @BeforeEach
  void setUp() {
    command = new MediorOrder(new Chef(), new Cook());
  }

  @Test
  public void orderStartsCooking() {
    iWaiter.makeOrder();
    assertThat(baos.toString()).isEqualToIgnoringWhitespace("Cooking soup Cooking steak Cooking some potatoes");
  }
}