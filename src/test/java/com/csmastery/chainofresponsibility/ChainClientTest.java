package com.csmastery.chainofresponsibility;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChainClientTest {

  private IChainClient chainClient;

  @BeforeEach
  public void init() {
    chainClient = new NoPatternChainClient();
  }

  @Test
  public void nameShouldBeNotEmpyty() {
    assertFalse(chainClient.validateUser(User.builder().age(50).email("hello@bello.com").build()));
  }

  @Test
  public void ageShouldBeBiggerThan18() {
    assertFalse(chainClient.validateUser(User.builder().name("Peti").email("hello@bello.com").build()));
  }

  @Test
  public void emailShouldBeValid() {
    assertFalse(chainClient.validateUser(User.builder().age(22).name("Peti").email("valami").build()));
  }

  @Test
  public void validUserReturnsTrue() {
    assertTrue(chainClient.validateUser(User.builder().age(22).name("Peti").email("peti@valami.com").build()));
  }

}