package com.kodilla;

import static com.kodilla.InputOutputController.getPlayerMove;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public int getMove(GameRules rules) {
        return getPlayerMove(rules);
    }
}
