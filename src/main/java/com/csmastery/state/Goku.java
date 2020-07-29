package com.csmastery.state;

import java.util.stream.IntStream;

public class Goku {

  private TransformationLevel currentLevel = TransformationLevel.FIGHTER;

  public TransformationLevel powerUp() {
    TransformationLevel[] values = TransformationLevel.values();
    int levelIndex = IntStream.range(0, values.length).filter(i -> currentLevel.equals(values[i])).findFirst()
        .orElse(-1);
    currentLevel = values[(levelIndex + 1) % values.length];
    return currentLevel;
  }

  public TransformationLevel getCurrentLevel() {
    return currentLevel;
  }

  public String hairColor() {
    return switch (this.currentLevel) {
      case FIGHTER -> "Black";
      case SSJ1 -> "Yellow";
      case SSJ2 -> "Even More Yellow";
      case SSJ3 -> "Total Yellow and Long";
    };
  }

  public int attackValue() {
    return switch (this.currentLevel) {
      case FIGHTER -> 9000;
      case SSJ1 -> 100_000;
      case SSJ2 -> 100_000_000;
      case SSJ3 -> 500_000_000;
    };
  }

  public boolean tryToDestroyFrieza(Frieza frieza) {
    if (this.currentLevel == TransformationLevel.FIGHTER) {
      return false;
    } else {
      frieza.makeHimDead();
      return true;
    }
  }

}
