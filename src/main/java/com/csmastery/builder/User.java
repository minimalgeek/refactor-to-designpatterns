package com.csmastery.builder;

import com.google.common.base.Strings;

public class User {

  private String email;
  private int age;
  private String name;
  private double height;

  public User() throws Exception {
    this(null);
  }

  public User(String email) throws Exception {
    if (Strings.isNullOrEmpty(email))
      throw new Exception("Email shouldn't be empty");
    this.email = email;
  }

  public User(String email, int age) throws Exception {
    this(email);
    this.age = age;
  }

  public User(String email, String name) throws Exception {
    this(email);
    this.name = name;
  }

  public User(String email, double height) throws Exception {
    this(email);
    this.height = height;
  }

  public User(String email, String name, int age, double height) throws Exception {
    this(email);
    this.name = name;
    this.age = age;
    this.height = height;
  }

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

}