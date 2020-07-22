package com.csmastery.command;

import com.csmastery.command.model.Chef;
import com.csmastery.command.model.JuniorWaitress;
import org.junit.jupiter.api.BeforeEach;

public class JuniorWaitressTest extends AbstractJuniorTest {
  @BeforeEach
  public void initWaiter() {
    this.iWaiter = new JuniorWaitress();
  }

}