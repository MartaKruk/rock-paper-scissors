package com;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputOutputController {

    public static final Pattern PATTERN = Pattern.compile("^\\d+$");
    private static final Scanner scanner = new Scanner(System.in);
    private static final String X = "x";
    private static final String N = "n";
    private static final String Y = "y";
    private static final String HELLO = "Hello! Please enter your name: ";
    private static final String GAME_MODE = "Do you want to play Rock-Paper-Scissors (1) or Rock-Paper-Scissors-Lizard-Spock (2)?";
    private static final String WRONG_ANSWER = "Wrong answer. Please enter your answer again!";
    private static final String MAX_POINTS = "Enter number of points needed to win: ";
    private static final String RPS_CONTROLS = "\nGame controls:\n1 - stone\n2 - paper\n3 - scissors\n";
    private static final String RPSLS_CONTROLS = "\nGame controls:\n1 - stone\n2 - paper\n3 - scissors\n4 - lizard\n5 - Spock\n";
    private static final String MOVE = "Please enter your move: ";
    private static final String IS_END = "Do you want to end the game (x) or play again (n)?";
    private static final String ARE_YOU_SURE = "Are you sure? (y/n)";
    private static final String DRAW = "That's a draw!";

    public static String getPlayerName() {
        System.out.println(HELLO);
            return scanner.nextLine();
    }

    public static GameRules getRules() {
        System.out.println(GAME_MODE);
        do {
            String value = scanner.nextLine();
            boolean isNumber = isNaturalNumber(value);
            if (isNumber) {
                int number = Integer.parseInt(value);
                if (number == 1) {
                    return new RPSRules();
                } else if (number == 2) {
                    return new RPSLSRules();
                }
            }
            System.out.println(WRONG_ANSWER);
        } while (true);
    }

    public static int getMaxPoints() {
        System.out.println(MAX_POINTS);
        do {
            String value = scanner.nextLine();
            boolean isNumber = isNaturalNumber(value);
            if (isNumber) {
                int number = Integer.parseInt(value);
                if (number > 0 && number < 10) {
                    return number;
                }
            }
            System.out.println(WRONG_ANSWER);
        } while (true);
    }

    public static void printControlsInformation(GameRules rules) {
        if (rules instanceof RPSRules) {
            System.out.println(RPS_CONTROLS);
        } else {
            System.out.println(RPSLS_CONTROLS);
        }
    }

    public static int getPlayerMove(GameRules rules) {
        System.out.println(MOVE);
        do {
            String value = scanner.nextLine();
            boolean isNumber = isNaturalNumber(value);
            if (isNumber) {
                int number = Integer.parseInt(value);
                if (rules instanceof RPSRules) {
                    if (number > 0 && number < 4) {
                        return number;
                    }
                } else {
                    if (number > 0 && number < 6) {
                        return number;
                    }
                }
            }
            System.out.println(WRONG_ANSWER);
        } while (true);
    }

    public static boolean isGameOver() {
        do {
            System.out.println(IS_END);
            String answer = scanner.nextLine();
            switch (answer) {
                case N:
                    System.out.println(ARE_YOU_SURE);
                    answer = scanner.nextLine();
                    switch (answer) {
                        case Y:
                            return false;
                        case N:
                            return InputOutputController.isGameOver();
                    }
                case X:
                    System.out.println(ARE_YOU_SURE);
                    answer = scanner.nextLine();
                    switch (answer) {
                        case Y:
                            return true;
                        case N:
                            return InputOutputController.isGameOver();
                    }
            }
            System.out.println(WRONG_ANSWER);
        } while (true);
    }

    public static void printMoves(String player1Name, int player1Move, String player2Name, int player2Move) {
        System.out.println("Moves made: \n" + player1Name + " used " + nameMove(player1Move) + ", " + player2Name + " used " + nameMove(player2Move) + ".");
    }

    public static void printRoundWinner(String winner) {
        System.out.println(winner + " won this round.");
    }

    public static void printDraw() {
        System.out.println(DRAW);
    }

    public static void printCurrentScore(String player1Name, int player1Score, String player2Name, int player2Score) {
        System.out.println("Current score: \n" + player1Name + ": " + player1Score + ", " + player2Name + ": " + player2Score + ".\n");
    }

    public static void printEndScore(String player1Name, int player1Score, String player2Name, int player2Score) {
        System.out.println("End score: \n" + player1Name + ": " + player1Score + ", " + player2Name + ": " + player2Score + ".\n");
    }

    public static void printEndWinner(String winner) {
        System.out.println(winner + " won!");
    }

    static boolean isNaturalNumber(CharSequence input) {
        return input != null && PATTERN.matcher(input).matches();
    }

    private static String nameMove(int move) {
        String[] moves = { "stone", "paper", "scissors", "lizard", "Spock" };
        return moves[move-1];
    }
}
