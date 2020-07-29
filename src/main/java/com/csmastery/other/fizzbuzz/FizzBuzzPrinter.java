package com.csmastery.other.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzPrinter {

  private FizzBuzz fizzBuzz;

  public FizzBuzzPrinter(FizzBuzz fizzBuzz) {
    this.fizzBuzz = fizzBuzz;
  }

  public String printFizzBuzzQozz(int num) {
    return IntStream.range(1, num + 1).mapToObj(i -> fizzBuzz.convert(i)).collect(Collectors.joining("\n"));
  }

}
