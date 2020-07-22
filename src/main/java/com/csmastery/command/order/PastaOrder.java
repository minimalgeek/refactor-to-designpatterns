package com.csmastery.command.order;

import com.csmastery.command.model.Chef;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PastaOrder implements Order {

    private final Chef chef;

    @Override
    public void makeOrder() {
        chef.cookPasta();
    }
}
