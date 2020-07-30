package com.csmastery.state;

public class SSJ2 implements State {
    @Override
    public State nextState() {
        return new SSJ3();
    }

    @Override
    public String hairColor() {
        return "Even More Yellow";
    }

    @Override
    public int attackValue() {
        return 100_000_000;
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        frieza.makeHimDead();
        return true;
    }

    @Override
    public TransformationLevel getLevel() {
        return TransformationLevel.SSJ2;
    }
}
