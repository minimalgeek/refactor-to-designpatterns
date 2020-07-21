package com.csmastery.command;

import com.csmastery.command.controller.*;
import com.csmastery.command.orders.ICommand;
import com.csmastery.command.orders.JuniorOrder;
import com.csmastery.command.orders.MediorOrder;
import com.csmastery.command.service.Chef;

import java.util.Stack;

public class Restaurant {

    private static Stack<ICommand> orderHistory = new Stack<>();

    public static void main(String[] args) {
        Chef chef = new Chef();
        com.csmastery.command.service.Cook cook = new com.csmastery.command.service.Cook();

        ICommand juniorOrder = new JuniorOrder(chef);
        ICommand mediorOrder = new MediorOrder(chef, cook);
        
        IWaiter juniorWaiter = new JuniorWaiter(() -> {
            ICommand juniorOrder1 = new JuniorOrder(chef);
            orderHistory.push(juniorOrder1);
            juniorOrder1.execute();
        });
        IWaiter juniorWaitress = new com.csmastery.command.controller.JuniorWaitress(juniorOrder);
        IWaiter mediorWaiter = new MediorSteakWaiter(mediorOrder);
        IWaiter mediorWaitress = new MediorSteakWaitress(mediorOrder);
        
        juniorWaiter.makeOrder();
        juniorWaitress.makeOrder();
        mediorWaiter.makeOrder();
        mediorWaitress.makeOrder();
    }
}
