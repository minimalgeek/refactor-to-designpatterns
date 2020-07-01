package com.csmastery.chainofresponsibility;

public abstract class BaseHandler implements Handler {
    private Handler nextHandler;
    public abstract boolean validate(User user);

    @Override
    public boolean handle(User user) {
        if (validate(user)) {
            if (nextHandler == null) return true;
            return nextHandler.handle(user);
        }
        return false;
    }

    @Override
    public Handler setNext(Handler handler) {
        this.nextHandler = handler;
        return nextHandler;
    }
}
