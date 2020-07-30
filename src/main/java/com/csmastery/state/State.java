package com.csmastery.state;

public interface State {

    State nextState();

    String hairColor();

    int attackValue();

    boolean tryToDestroyFrieza(Frieza frieza);

    TransformationLevel getLevel();

}
