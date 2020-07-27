package com.csmastery.command;

import org.junit.jupiter.api.BeforeEach;

public class MediorSteakWaiterTest extends AbstractMediorTest {

  @BeforeEach
  public void initWaiter() {
    this.iWaiter = new MediorSteakWaiter(new Chef(), new Cook());
  }
}