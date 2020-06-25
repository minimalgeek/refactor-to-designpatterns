package com.csmastery.chainofresponsibility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Strings;

public class NoPatternChainClient implements IChainClient {

  @Override
  public boolean validateUser(User user) {
    if (!Strings.isNullOrEmpty(user.getName())) {
      if (user.getAge() >= 18) {
        if (!Strings.isNullOrEmpty(user.getEmail()) && isValidEmailAddress(user.getEmail())) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean isValidEmailAddress(String email) {
    Pattern pattern = Pattern.compile("^.+@.+\\..+$");
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
  }

}
