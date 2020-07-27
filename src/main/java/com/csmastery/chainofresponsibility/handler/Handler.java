package com.csmastery.chainofresponsibility.handler;

import com.csmastery.chainofresponsibility.User;

public interface Handler {
    boolean handle(User user);
    Handler setNext(Handler handler);
}
