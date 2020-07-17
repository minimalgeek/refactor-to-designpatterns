package com.csmastery.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JuniorWaitress implements IWaiter {
  private Chef chef;

  public void makeOrder() {
    chef.cookSoup();
    chef.cookPasta();
  }
}