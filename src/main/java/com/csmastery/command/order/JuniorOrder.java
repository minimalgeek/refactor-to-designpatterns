package com.csmastery.command.order;

import com.csmastery.command.service.Chef;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JuniorOrder implements ICommand{

    private Chef chef;

    @Override
    public void execute() {
        chef.cookSoup();
        chef.cookPasta();
    }
}
