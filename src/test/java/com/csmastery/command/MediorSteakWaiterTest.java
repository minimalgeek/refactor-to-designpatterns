package com.csmastery.command;

import com.csmastery.command.controller.MediorSteakWaiter;
import org.junit.jupiter.api.BeforeEach;

public class MediorSteakWaiterTest extends AbstractMediorTest {

  @BeforeEach
  public void initWaiter() {
    this.iWaiter = new MediorSteakWaiter(this.command);
  }
}