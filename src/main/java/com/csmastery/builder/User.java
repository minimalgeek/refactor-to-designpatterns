package com.csmastery.builder;

import com.google.common.base.Strings;

public class User {

  private String email;
  private int age;
  private String name;
  private double height;

  private User() { }

  public String getEmail() {
    return email;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public double getHeight() {
    return height;
  }

  public static UserBuilder builder() {
    return new UserBuilder();
  }

  public static class UserBuilder {
    private User user = new User();

    private UserBuilder() { }

    public UserBuilder setEmail(String email){
      user.email = email;
      return this;
    }

    public UserBuilder setAge(int age){
      user.age = age;
      return this;
    }

    public UserBuilder setName(String name){
      user.name = name;
      return this;
    }

    public UserBuilder setHeight(double height){
      user.height = height;
      return this;
    }

    public UserBuilder reset() {
      user = new User();
      return this;
    }

    public User build() throws Exception {
      if(Strings.isNullOrEmpty(user.email))
        throw new Exception("Email shouldn't be empty");
      if(user.age < 18)
        throw new Exception("Too young");
      return user;
    }
  }
}