package com.csmastery.state;

public class FighterState implements State {


    @Override
    public State nextState() {

        return new SSJ1();
    }

    @Override
    public String hairColor() {
        return "Black";
    }

    @Override
    public int attackValue() {
        return 9000;
    }

    @Override
    public boolean tryToDestroyFrieza(Frieza frieza) {
        return false;
    }

    @Override
    public TransformationLevel getLevel() {
        return TransformationLevel.FIGHTER;
    }
}
