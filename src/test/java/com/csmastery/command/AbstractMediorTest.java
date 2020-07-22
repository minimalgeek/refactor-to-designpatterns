package com.csmastery.command;

import static org.assertj.core.api.Assertions.assertThat;

import com.csmastery.command.model.Chef;
import com.csmastery.command.model.Cook;
import com.csmastery.command.order.SideDishForSteakOrder;
import com.csmastery.command.order.SoupOrder;
import com.csmastery.command.order.SteakOrder;
import org.junit.jupiter.api.Test;

public abstract class AbstractMediorTest extends AbstractWaiterTest {
  @Test
  public void orderStartsCooking() {
    Chef chef = new Chef();
    Cook cook = new Cook();

    iWaiter.makeOrder(new SoupOrder(chef), new SteakOrder(chef), new SideDishForSteakOrder(cook));
    assertThat(baos.toString()).isEqualToIgnoringWhitespace("Cooking soup Cooking steak Cooking some potatoes");
  }
}