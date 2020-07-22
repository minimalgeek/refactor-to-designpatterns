package com.csmastery.command;

import com.csmastery.command.model.Chef;
import com.csmastery.command.model.Cook;
import com.csmastery.command.model.MediorSteakWaiter;
import org.junit.jupiter.api.BeforeEach;

public class MediorSteakWaiterTest extends AbstractMediorTest {

  @BeforeEach
  public void initWaiter() {
    this.iWaiter = new MediorSteakWaiter();
  }
}