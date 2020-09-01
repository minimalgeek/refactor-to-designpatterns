package com.csmastery.command;

import com.csmastery.command.controller.MediorSteakWaitress;
import org.junit.jupiter.api.BeforeEach;

public class MediorSteakWaitressTest extends AbstractMediorTest {

  @BeforeEach
  public void initWaiter() {
    this.iWaiter = new MediorSteakWaitress(this.command);
  }
}