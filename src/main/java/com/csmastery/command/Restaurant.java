package com.csmastery.command;

import com.csmastery.command.controller.*;
import com.csmastery.command.order.ICommand;
import com.csmastery.command.order.JuniorOrder;
import com.csmastery.command.order.MediorOrder;
import com.csmastery.command.service.Chef;
import com.csmastery.command.service.Cook;

import java.util.Stack;

public class Restaurant {

    private static Stack<ICommand> orderHistory = new Stack<>();

    public static void main(String[] args) {
        Chef chef = new Chef();
        Cook cook = new Cook();

        ICommand juniorOrder = new JuniorOrder(chef);
        ICommand mediorOrder = new MediorOrder(chef, cook);

        IWaiter juniorWaiter = new JuniorWaiter(() -> {
            ICommand juniorOrder1 = new JuniorOrder(chef);
            orderHistory.push(juniorOrder1);
            juniorOrder1.execute();
        });
        IWaiter juniorWaitress = new JuniorWaitress(juniorOrder);
        IWaiter mediorWaiter = new MediorSteakWaiter(mediorOrder);
        IWaiter mediorWaitress = new MediorSteakWaitress(mediorOrder);

        juniorWaiter.makeOrder();
        juniorWaitress.makeOrder();
        mediorWaiter.makeOrder();
        mediorWaitress.makeOrder();
    }
}
