package com.csmastery.command.orders;

import com.csmastery.command.service.Chef;
import com.csmastery.command.service.Cook;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MediorOrder implements com.csmastery.command.orders.ICommand {

    private com.csmastery.command.service.Chef chef;
    private com.csmastery.command.service.Cook cook;
    
    @Override
    public void execute() {
        chef.cookSoup();
        chef.cookSteak();
        cook.cookSideDishForSteak();
    }
}
