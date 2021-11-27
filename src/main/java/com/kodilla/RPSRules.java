package com.kodilla;

public class RPSRules implements GameRules {

    @Override
    public int whoWon(int player1Move, int player2Move) {
        int[][] whoWon = new int[3][3];
        whoWon[0][0] = 0;
        whoWon[0][1] = 2;
        whoWon[0][2] = 1;
        whoWon[1][0] = 1;
        whoWon[1][1] = 0;
        whoWon[1][2] = 2;
        whoWon[2][0] = 2;
        whoWon[2][1] = 1;
        whoWon[2][2] = 0;
        return whoWon[player1Move-1][player2Move-1];
    }

    @Override
    public String rulesName() {
        return "RPS";
    }
}
