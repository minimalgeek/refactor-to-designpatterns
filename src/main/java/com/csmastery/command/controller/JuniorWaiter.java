package com.csmastery.command.controller;

import com.csmastery.command.orders.ICommand;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JuniorWaiter implements com.csmastery.command.controller.IWaiter {

  private com.csmastery.command.orders.ICommand command;

  public void makeOrder() {
    command.execute();
  }
}