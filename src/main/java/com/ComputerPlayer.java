package com;

import java.util.Random;

public class ComputerPlayer extends Player {

    private static final Random random = new Random();

    public ComputerPlayer() {
        super("Computer");
    }

    @Override
    public int getMove(GameRules rules) {
        if (rules instanceof RPSRules) {
            return random.nextInt(3) + 1;
        } else {
            return random.nextInt(5) + 1;
        }
    }
}
