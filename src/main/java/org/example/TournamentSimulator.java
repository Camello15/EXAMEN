package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class TournamentSimulator {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Player> players = new ArrayList<>();

// Crear los 16 jugadores
        List<Player> allPlayers = new ArrayList<>();
        for (int i = 1; i <= 16; i++) {
            allPlayers.add(new Player("Jugador " + i));
        }

// Emparejar: 1 vs 16, 2 vs 15, ..., 8 vs 9
        for (int i = 0; i < 8; i++) {
            players.add(allPlayers.get(i));               // Jugador 1, 2, ..., 8
            players.add(allPlayers.get(15 - i));          // Jugador 16, 15, ..., 9
        }

        RoundExecutor executor = new RoundExecutor();

        players = executor.playRound(players, "OCTAVOS DE FINAL");
        players = executor.playRound(players, "CUARTOS DE FINAL");
        players = executor.playRound(players, "SEMIFINAL");
        players = executor.playRound(players, "FINAL");

        System.out.println("🏆 ¡Campeón del torneo: " + players.get(0).getName() + "!");
    }
}
