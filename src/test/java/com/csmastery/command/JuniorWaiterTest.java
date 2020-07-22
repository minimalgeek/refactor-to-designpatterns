package com.csmastery.command;

import com.csmastery.command.model.Chef;
import com.csmastery.command.model.JuniorWaiter;
import org.junit.jupiter.api.BeforeEach;

public class JuniorWaiterTest extends AbstractJuniorTest {
  @BeforeEach
  public void initWaiter() {
    this.iWaiter = new JuniorWaiter();
  }
}