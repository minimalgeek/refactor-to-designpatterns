package com.csmastery.state;

public class SSJ3 implements State {
    @Override
    public State nextState() {
        return new FighterState();
    }

    @Override
    public String hairColor() {
        return "Total Yellow and Long";
    }

    @Override
    public int attackValue() {
        return 500_000_000;
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        frieza.makeHimDead();
        return true;
    }

    @Override
    public TransformationLevel getLevel() {
        return TransformationLevel.SSJ3;
    }
}
