package com.csmastery.command;

import com.csmastery.command.orders.ICommand;
import com.csmastery.command.orders.MediorOrder;
import com.csmastery.command.service.Chef;
import com.csmastery.command.service.Cook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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