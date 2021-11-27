package com;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public int getMove(GameRules rules) {
        return InputOutputController.getPlayerMove(rules);
    }
}
