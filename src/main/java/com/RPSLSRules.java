package com;

public class RPSLSRules implements GameRules {

    @Override
    public int whoWon(int player1Move, int player2Move) {
        int[][] whoWon = {
                {0, 2, 1, 1, 2},
                {1, 0, 2, 2, 1},
                {2, 1, 0, 1, 2},
                {2, 1, 2, 0, 1},
                {1, 2, 1, 2, 0}
        };

        return whoWon[player1Move-1][player2Move-1];
    }
}
