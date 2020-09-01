package com.csmastery.command;

import static org.assertj.core.api.Assertions.assertThat;

import com.csmastery.command.order.ICommand;
import com.csmastery.command.order.JuniorOrder;
import com.csmastery.command.service.Chef;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public abstract class
AbstractJuniorTest extends AbstractWaiterTest{

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