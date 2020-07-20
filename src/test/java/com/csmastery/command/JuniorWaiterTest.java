package com.csmastery.command;

import org.junit.jupiter.api.BeforeEach;

public class JuniorWaiterTest extends AbstractJuniorTest {
  @BeforeEach
  public void initWaiter() {
    this.iWaiter = new JuniorWaiter(new Chef());
  }
}