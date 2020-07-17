package com.csmastery.command;

import org.junit.jupiter.api.BeforeEach;

public class MediorSteakWaitressTest extends AbstractMediorTest {

  @BeforeEach
  public void initWaiter() {
    this.iWaiter = new MediorSteakWaitress(new Chef(), new Cook());
  }
}