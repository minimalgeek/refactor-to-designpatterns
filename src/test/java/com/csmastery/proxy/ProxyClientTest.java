package com.csmastery.proxy;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProxyClientTest {

  private static IProxyClient proxyClient;

  @BeforeAll
  static void init() {
    proxyClient = new NoPatternProxyClient();
  }

  @Test
  @Order(1)
  public void _7919isPrime() {
    assertTrue(proxyClient.isPrime(7919));
  }

  @Test
  @Order(2)
  public void _7841isPrime() {
    assertTrue(proxyClient.isPrime(7841));
  }

  @Test
  @Order(3)
  public void _7753isPrime() {
    assertTrue(proxyClient.isPrime(7753));
  }

  @Test
  @Order(4)
  public void _939193isPrime(){
    assertTrue(proxyClient.isPrime(939193));
  }

  @Test
  @Order(5)
  public void _7500isNotPrime() {
    assertFalse(proxyClient.isPrime(18));
  }

  @Test
  @Order(6)
  public void _7000isNotPrime() {
    assertFalse(proxyClient.isPrime(15));
  }

}
