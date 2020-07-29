package com.csmastery.chainofresponsibility.handler;

import com.csmastery.chainofresponsibility.User;
import com.google.common.base.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailHandler extends BaseHandler {
    @Override
    public boolean validate(User user) {
        return !Strings.isNullOrEmpty(user.getEmail()) && isValidEmailAddress(user.getEmail());
    }

    public boolean isValidEmailAddress(String email) {
        Pattern pattern = Pattern.compile("^.+@.+\\..+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
