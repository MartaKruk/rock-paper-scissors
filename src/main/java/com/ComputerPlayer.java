package com;

import java.util.Random;

public class ComputerPlayer extends Player{

    private Random random = new Random();

    public ComputerPlayer() {
        super("Computer");
    }

    @Override
    public int getMove(GameRules rules) {
        if (rules.rulesName().equals("RPS")) {
            return random.nextInt(3) + 1;
        } else {
            return random.nextInt(5) + 1;
        }
    }
}
