package com;

public class RPSRules implements GameRules {

    @Override
    public int whoWon(int player1Move, int player2Move) {
        int[][] whoWon = {
                {0, 2, 1},
                {1, 0, 2},
                {2, 1, 0}
        };

        return whoWon[player1Move-1][player2Move-1];
    }
}
