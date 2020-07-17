package com.csmastery.command;

import org.junit.jupiter.api.BeforeEach;

public class JuniorWaitressTest extends AbstractJuniorTest {
  @BeforeEach
  public void initWaiter() {
    this.iWaiter = new JuniorWaitress(new Chef());
  }

}