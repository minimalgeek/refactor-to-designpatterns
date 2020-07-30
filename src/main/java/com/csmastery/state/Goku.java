package com.csmastery.state;

public class Goku {

  private State currentState = new FighterState();

  public TransformationLevel powerUp() {
    this.currentState = currentState.nextState();
    return currentState.getLevel();
  }

  public TransformationLevel getCurrentLevel() {
    return currentState.getLevel();
  }

  public String hairColor() {
      return currentState.hairColor();
  }

  public int attackValue() {
    return currentState.attackValue();
  }

  public boolean tryToDestroyFrieza(Frieza frieza) {
      return currentState.tryToDestroyFrieza(frieza);
  }
}
