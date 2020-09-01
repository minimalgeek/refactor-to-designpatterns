package com.csmastery.command.order;

import com.csmastery.command.service.Chef;
import com.csmastery.command.service.Cook;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MediorOrder implements ICommand {

    private Chef chef;
    private Cook cook;

    @Override
    public void execute() {
        chef.cookSoup();
        chef.cookSteak();
        cook.cookSideDishForSteak();
    }
}
