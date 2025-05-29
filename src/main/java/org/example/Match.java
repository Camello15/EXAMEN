package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class Match implements Callable<MatchResult> {

    private final Player player1;
    private final Player player2;
    private final Random random = new Random();

    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public MatchResult call() throws Exception {
        long startTime = System.currentTimeMillis();

        int p1Wins = 0, p2Wins = 0;
        int set = 1;

        StringBuilder matchOutput = new StringBuilder();
        matchOutput.append(player1.getName()).append(" vs ").append(player2.getName()).append("\n");

        // Tiempo total del partido entre 1500ms y 2000ms
        int totalMatchTime = 1500 + random.nextInt(501);
        // Lista para acumular las duraciones por set (se calcularán al final)

        // Simular los sets sin dormir aún
        List<String> setResults = new ArrayList<>();
        while (p1Wins < 2 && p2Wins < 2) {
            Player winner = random.nextBoolean() ? player1 : player2;
            if (winner == player1) {
                p1Wins++;
            } else {
                p2Wins++;
            }
            setResults.add("Set " + set + ": " + winner.getName());
            set++;
        }

        int setsPlayed = setResults.size();
        int sleepPerSet = totalMatchTime / setsPlayed;

        // Simular tiempo y luego mostrar los resultados
        for (String setLine : setResults) {
            Thread.sleep(sleepPerSet);
            matchOutput.append(setLine).append("\n");
        }

        Player matchWinner = p1Wins == 2 ? player1 : player2;
        matchOutput.append("Ganador del partido: ").append(matchWinner.getName()).append("\n");

        long endTime = System.currentTimeMillis();
        double durationSeconds = (endTime - startTime) / 1000.0;

        matchOutput.append(String.format("Duración del partido: %.2f segundos\n\n", durationSeconds));

        return new MatchResult(matchWinner, matchOutput.toString());
    }
}