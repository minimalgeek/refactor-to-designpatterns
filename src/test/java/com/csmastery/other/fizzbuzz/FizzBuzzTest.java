package com.csmastery.other.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @BeforeEach
  public void init() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void smokeTest() {
    assertTrue(true);
  }

  @Test
  public void oneReturnsOne() {
    assertEquals("1", fizzBuzz.convert(1));
  }

  @Test
  public void twoReturnTwo() {
    assertEquals("2", fizzBuzz.convert(2));
  }

  @Test
  public void threeReturnsFizz() {
    assertEquals("Fizz", fizzBuzz.convert(3));
  }

  @Test
  public void sixReturnsFizz() {
    assertEquals("Fizz", fizzBuzz.convert(6));
  }

  @Test
  public void fiveReturnsBuzz() {
    assertEquals("Buzz", fizzBuzz.convert(5));
  }

  @Test
  public void tenReturnsBuzz() {
    assertEquals("Buzz", fizzBuzz.convert(10));
  }

  @Test
  public void fifteenReturnsFizzBuzz() {
    assertEquals("FizzBuzz", fizzBuzz.convert(15));
  }

  
  @Test
  public void thirtyReturnsFizzBuzz() {
    assertEquals("FizzBuzz", fizzBuzz.convert(30));
  }

  @Test
  public void sevenReturnsQozz() {
    assertEquals("Qozz", fizzBuzz.convert(7));
  }

  @Test
  public void twentyOneReturnsFizzQozz() {
    assertEquals("FizzQozz", fizzBuzz.convert(21));
  }

  @Test
  public void thirtyFiveReturnsBuzzQozz() {
    assertEquals("BuzzQozz", fizzBuzz.convert(35));
  }

  @Test
  public void hundredAndFiveReturnsFizzBuzzQozz() {
    assertEquals("FizzBuzzQozz", fizzBuzz.convert(105));
  }

  
}