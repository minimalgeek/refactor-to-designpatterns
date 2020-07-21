package com.csmastery.command;

import com.csmastery.command.controller.JuniorWaitress;
import org.junit.jupiter.api.BeforeEach;

public class JuniorWaitressTest extends AbstractJuniorTest {
  @BeforeEach
  public void initWaiter() {
    this.iWaiter = new JuniorWaitress(this.command);
  }

}