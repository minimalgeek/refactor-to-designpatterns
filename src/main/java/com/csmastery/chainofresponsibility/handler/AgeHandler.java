package com.csmastery.chainofresponsibility.handler;

import com.csmastery.chainofresponsibility.User;

public class AgeHandler extends BaseHandler {
    @Override
    public boolean validate(User user) {
        return user.getAge() >= 18;
    }
}
