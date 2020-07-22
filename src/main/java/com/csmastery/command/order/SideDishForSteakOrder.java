package com.csmastery.command.order;

import com.csmastery.command.model.Cook;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SideDishForSteakOrder implements Order {
    private final Cook cook;

    @Override
    public void makeOrder() {
        cook.cookSideDishForSteak();
    }
}
