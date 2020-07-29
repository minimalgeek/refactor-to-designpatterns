package com.csmastery.state;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GokuSSJProgressionTest {

  private Goku goku;
  private Frieza frieza;

  @BeforeEach
  public void init() {
    this.goku = new Goku();
    this.frieza = new Frieza();
  }

  @Test
  public void smokeTest() {
    assertThat(goku).isNotNull();
  }

  @Test
  public void powerUpIsCyclical() {
    assertThat(goku.getCurrentLevel()).isEqualTo(TransformationLevel.FIGHTER);
    goku.powerUp();
    assertThat(goku.getCurrentLevel()).isEqualTo(TransformationLevel.SSJ1);
    goku.powerUp();
    assertThat(goku.getCurrentLevel()).isEqualTo(TransformationLevel.SSJ2);
    goku.powerUp();
    assertThat(goku.getCurrentLevel()).isEqualTo(TransformationLevel.SSJ3);
    goku.powerUp();
    assertThat(goku.getCurrentLevel()).isEqualTo(TransformationLevel.FIGHTER);
  }

  @Test
  public void simpleGokuCantDefeatFrieza() {
    assertThat(goku).extracting(Goku::hairColor, Goku::attackValue).containsExactly("Black", 9000);
    goku.tryToDestroyFrieza(frieza);
    assertThat(frieza.isAlive()).isTrue();
  }

  @Test
  public void SSJ1HairIsYellowAndCanDefeatFrieza() {
    assertThat(goku).extracting(Goku::hairColor, Goku::attackValue).containsExactly("Black", 9000);
    goku.powerUp();
    assertThat(goku).extracting(Goku::hairColor, Goku::attackValue).containsExactly("Yellow", 100_000);
    goku.tryToDestroyFrieza(frieza);
    assertThat(frieza.isAlive()).isFalse();
  }

  @Test
  public void SSJ2HairIsMoreYellowAndCanDefeatFrieza() {
    assertThat(goku).extracting(Goku::hairColor, Goku::attackValue).containsExactly("Black", 9000);
    goku.powerUp();
    goku.powerUp();
    assertThat(goku).extracting(Goku::hairColor, Goku::attackValue).containsExactly("Even More Yellow", 100_000_000);
    goku.tryToDestroyFrieza(frieza);
    assertThat(frieza.isAlive()).isFalse();
  }

  @Test
  public void SSJ3HairIsTotalYellowAndLongAndCanDefeatFrieza() {
    assertThat(goku).extracting(Goku::hairColor, Goku::attackValue).containsExactly("Black", 9000);
    goku.powerUp();
    goku.powerUp();
    goku.powerUp();
    assertThat(goku).extracting(Goku::hairColor, Goku::attackValue).containsExactly("Total Yellow and Long",
        500_000_000);
    goku.tryToDestroyFrieza(frieza);
    assertThat(frieza.isAlive()).isFalse();
  }

  @Test
  public void gokuResetsAfterSSJ3ToHisDefaultState() {
    assertThat(goku).extracting(Goku::hairColor, Goku::attackValue).containsExactly("Black", 9000);
    goku.powerUp();
    goku.powerUp();
    goku.powerUp();
    goku.powerUp();
    assertThat(goku).extracting(Goku::hairColor, Goku::attackValue).containsExactly("Black", 9000);
  }

}