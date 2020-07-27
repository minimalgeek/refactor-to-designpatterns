package com.csmastery.chainofresponsibility.handler;

import com.csmastery.chainofresponsibility.User;
import com.google.common.base.Strings;

public class NameHandler extends BaseHandler {
    @Override
    public boolean validate(User user) {
        return !Strings.isNullOrEmpty(user.getName());
    }
}
