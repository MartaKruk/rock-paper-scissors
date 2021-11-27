package com;

public class RPSLSRules implements GameRules {

    @Override
    public int whoWon(int player1Move, int player2Move) {
        int[][] whoWon = new int[5][5];
        whoWon[0][0] = 0;
        whoWon[0][1] = 2;
        whoWon[0][2] = 1;
        whoWon[0][3] = 1;
        whoWon[0][4] = 2;
        whoWon[1][0] = 1;
        whoWon[1][1] = 0;
        whoWon[1][2] = 2;
        whoWon[1][3] = 2;
        whoWon[1][4] = 1;
        whoWon[2][0] = 2;
        whoWon[2][1] = 1;
        whoWon[2][2] = 0;
        whoWon[2][3] = 1;
        whoWon[2][4] = 2;
        whoWon[3][0] = 2;
        whoWon[3][1] = 1;
        whoWon[3][2] = 2;
        whoWon[3][3] = 0;
        whoWon[3][4] = 1;
        whoWon[4][0] = 1;
        whoWon[4][1] = 2;
        whoWon[4][2] = 1;
        whoWon[4][3] = 2;
        whoWon[4][4] = 0;
        return whoWon[player1Move-1][player2Move-1];
    }

    @Override
    public String rulesName() {
        return "RPSLS";
    }
}
