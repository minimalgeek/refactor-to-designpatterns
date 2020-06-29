package com.csmastery.fizzbuzz;

public class FizzBuzzPrinter {

  private FizzBuzz fizzBuzz;

  public FizzBuzzPrinter(FizzBuzz fizzBuzz) {
    this.fizzBuzz = fizzBuzz;
  }

  public String printFizzBuzzQozz(int num) {
    StringBuffer buffer = new StringBuffer();
    for (int i = 1; i <= num; i++) {
      buffer.append(fizzBuzz.convert(i));
      buffer.append('\n');
    }
    buffer.setLength(buffer.length() - 1);
    return buffer.toString();
  }

}
