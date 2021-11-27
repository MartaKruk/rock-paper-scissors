package com.kodilla;

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
            if (whoWon == 1) {
                player1.addPoint();
                System.out.println("Moves made: " + player1.getName() + " used " + player1Move + ", " + player2.getName() + " used " + player2Move + ".\n" +
                        player1.getName() + " won this round.\n");
            } else if (whoWon == 2) {
                player2.addPoint();
                System.out.println("Moves made: " + player1.getName() + " used " + player1Move + ", " + player2.getName() + " used " + player2Move + ".\n" +
                        player2.getName() + " won this round.\n");
            } else {
                System.out.println("Moves made: " + player1.getName() + " used " + player1Move + ", " + player2.getName() + " used " + player2Move + ".\n" +
                        "That's a draw!\n");
            }
            System.out.println("Current score: " + player1.getName() + ": " + player1.getPoints() + ", " + player2.getName() + ": " + player2.getPoints() + ".");
        }
        if (player1.getPoints()> player2.getPoints()) {
            System.out.println(player1.getName() + " won!\n");
        } else {
            System.out.println(player2.getName() + " won!\n");
        }
        System.out.println("End score: " + player1.getName() + ": " + player1.getPoints() + ", " + player2.getName() + ": " + player2.getPoints() + ".");
    }
}
