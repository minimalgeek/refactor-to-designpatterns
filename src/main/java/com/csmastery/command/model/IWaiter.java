package com.csmastery.command.model;

import com.csmastery.command.order.Order;

public interface IWaiter {

  public default void makeOrder(Order ...orders) {
    for (Order order : orders) {
      order.makeOrder();
    }
  };
}