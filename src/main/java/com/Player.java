package com;

public abstract class Player {

    private final String name;
    private int points = 0;

    public Player(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public abstract int getMove(GameRules rules);

    public void addPoint() {
        points++;
    }

}
