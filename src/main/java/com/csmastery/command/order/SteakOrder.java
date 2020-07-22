package com.csmastery.command.order;

import com.csmastery.command.model.Chef;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SteakOrder implements Order {

    private final Chef chef;

    @Override
    public void makeOrder() {
        chef.cookSteak();
    }
}
