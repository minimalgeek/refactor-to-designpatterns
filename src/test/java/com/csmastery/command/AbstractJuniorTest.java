package com.csmastery.command;

import com.csmastery.command.orders.ICommand;
import com.csmastery.command.orders.JuniorOrder;
import com.csmastery.command.service.Chef;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public abstract class AbstractJuniorTest extends AbstractWaiterTest {

  protected ICommand command;

  @BeforeEach
  void setUp() {
    command = new JuniorOrder(new Chef());
  }
  
  @Test
  public void orderStartsCooking() {
    iWaiter.makeOrder();
    assertThat(baos.toString()).isEqualToIgnoringWhitespace("Cooking soup Cooking pasta");
  }

}