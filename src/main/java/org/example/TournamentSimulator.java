package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class TournamentSimulator {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Player> players = new ArrayList<>();
        for (int i = 1; i <= 16; i++) {
            players.add(new Player("Jugador " + i));
        }

        RoundExecutor executor = new RoundExecutor();

        players = executor.playRound(players, "OCTAVOS DE FINAL");
        players = executor.playRound(players, "CUARTOS DE FINAL");
        players = executor.playRound(players, "SEMIFINAL");
        players = executor.playRound(players, "FINAL");

        System.out.println("🏆 ¡Campeón del torneo: " + players.get(0).getName() + "!");
    }
}
