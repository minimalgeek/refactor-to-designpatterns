package com.csmastery.chainofresponsibility;

public interface Handler {
    boolean handle(User user);
    Handler setNext(Handler handler);
}
