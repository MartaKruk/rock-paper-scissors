package com;

public class GameProcessor {

    private final Player player1;
    private final Player player2;
    private final GameRules rules;
    private final int maxPoints;

    public GameProcessor(Player player1, Player player2, GameRules rules, int maxPoints) {
        this.player1 = player1;
        this.player2 = player2;
        this.rules = rules;
        this.maxPoints = maxPoints;
    }

    public void play() {
        InputOutputController.printControlsInformation(rules);
        while(player1.getPoints() < maxPoints && player2.getPoints() < maxPoints) {
            int player1Move = player1.getMove(rules);
            int player2Move = player2.getMove(rules);
            int whoWon = rules.whoWon(player1Move, player2Move);
            InputOutputController.printMoves(player1.getName(), player1Move, player2.getName(), player2Move);
            if (whoWon == 1) {
                player1.addPoint();
                InputOutputController.printRoundWinner(player1.getName());
            } else if (whoWon == 2) {
                player2.addPoint();
                InputOutputController.printRoundWinner(player2.getName());
            } else {
                InputOutputController.printDraw();
            }
            InputOutputController.printCurrentScore(player1.getName(), player1.getPoints(), player2.getName(), player2.getPoints());
        }
        if (player1.getPoints()> player2.getPoints()) {
            InputOutputController.printEndWinner(player1.getName());
        } else {
            InputOutputController.printEndWinner(player2.getName());
        }
        InputOutputController.printEndScore(player1.getName(), player1.getPoints(), player2.getName(), player2.getPoints());
    }
}
