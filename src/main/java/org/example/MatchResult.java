package org.example;

public class MatchResult {
    private final Player winner;
    private final String output;

    public MatchResult(Player winner, String output) {
        this.winner = winner;
        this.output = output;
    }

    public Player getWinner() {
        return winner;
    }

    public String getOutput() {
        return output;
    }
}
