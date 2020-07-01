package com.csmastery.chainofresponsibility;

public class AgeHandler extends BaseHandler {
    @Override
    public boolean validate(User user) {
        return user.getAge() >= 18;
    }
}
