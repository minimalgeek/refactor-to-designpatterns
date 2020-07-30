package com.csmastery.state;

public class SSJ1 implements State {
    @Override
    public State nextState() {
        return new SSJ2();
    }

    @Override
    public String hairColor() {
        return "Yellow";
    }

    @Override
    public int attackValue() {
        return 100_000;
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        frieza.makeHimDead();
        return true;
    }

    @Override
    public TransformationLevel getLevel() {
        return TransformationLevel.SSJ1;
    }
}
