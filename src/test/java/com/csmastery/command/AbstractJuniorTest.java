package com.csmastery.command;

import static org.assertj.core.api.Assertions.assertThat;

import com.csmastery.command.model.Chef;
import com.csmastery.command.order.PastaOrder;
import com.csmastery.command.order.SoupOrder;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


public abstract class AbstractJuniorTest extends AbstractWaiterTest{

  @Test
  public void orderStartsCooking() {
    Chef chef = new Chef();
    iWaiter.makeOrder(new SoupOrder(chef),  new PastaOrder(chef));
    assertThat(baos.toString()).isEqualToIgnoringWhitespace("Cooking soup Cooking pasta");
  }

}