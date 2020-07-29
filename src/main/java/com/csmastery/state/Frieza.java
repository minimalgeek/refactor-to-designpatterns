package com.csmastery.state;

public class Frieza {

  private boolean alive = true;

  public void makeHimDead() {
    this.alive = false;
  }

  public boolean isAlive() {
    return alive;
  }

}
