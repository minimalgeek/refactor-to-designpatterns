package com.csmastery.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MediorSteakWaitress implements IWaiter {

  private Chef chef;
  private Cook cook;

  public void makeOrder() {
    chef.cookSoup();
    chef.cookSteak();
    cook.cookSideDishForSteak();
  }
}