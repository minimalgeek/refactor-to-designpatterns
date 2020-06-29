package com.csmastery.fizzbuzz;

public class FizzBuzz {

  public String convert(int i) {
    StringBuffer buffer = new StringBuffer();
    
    if (i % 3 == 0) {
      buffer.append("Fizz");
    }
    if (i % 5 == 0) {
      buffer.append("Buzz");
    }
    if (i % 7 == 0) {
      buffer.append("Qozz");
    }

    return buffer.length() > 0 ? buffer.toString():Integer.toString(i);
  }

}
