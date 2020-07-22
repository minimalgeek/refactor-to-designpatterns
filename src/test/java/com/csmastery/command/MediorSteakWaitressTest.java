package com.csmastery.command;

import com.csmastery.command.model.Chef;
import com.csmastery.command.model.Cook;
import com.csmastery.command.model.MediorSteakWaitress;
import org.junit.jupiter.api.BeforeEach;

public class MediorSteakWaitressTest extends AbstractMediorTest {

  @BeforeEach
  public void initWaiter() {
    this.iWaiter = new MediorSteakWaitress();
  }
}