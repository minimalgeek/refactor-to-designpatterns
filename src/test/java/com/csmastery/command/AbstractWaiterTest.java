package com.csmastery.command;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import com.csmastery.command.controller.IWaiter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public abstract class AbstractWaiterTest {
  protected IWaiter iWaiter;
  protected static ByteArrayOutputStream baos;

  @BeforeAll
  public static void init() {
    baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    System.setOut(ps);
  }

  @AfterEach
  public void cleanUp() throws IOException {
    baos.flush();
  }
}