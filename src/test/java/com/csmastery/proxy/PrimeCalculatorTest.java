package com.csmastery.proxy;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PrimeCalculatorTest {

  private static NotEfficientPrimeCalculator primeCalculator;

  @BeforeAll
  static void init() {
    primeCalculator = new NotEfficientPrimeCalculator();
  }

  @Test
  @Order(1)
  public void _479001599isPrime() {
    assertTrue(primeCalculator.isPrime(479001599));
  }

  @Test
  @Order(2)
  public void _479001599isPrime_2() {
    assertTrue(primeCalculator.isPrime(479001599));
  }

  @Test
  @Order(3)
  public void _939193isPrime(){
    assertTrue(primeCalculator.isPrime(939193));
  }

  @Test
  @Order(4)
  public void _939193isPrime_2(){
    assertTrue(primeCalculator.isPrime(939193));
  }

  @Test
  @Order(5)
  public void _1_000_000_000isNotPrime() {
    assertFalse(primeCalculator.isPrime(1_000_000_000L));
  }

  @Test
  @Order(6)
  public void _1_000_000_000isNotPrime_2() {
    assertFalse(primeCalculator.isPrime(1_000_000_000L));
  }

}
