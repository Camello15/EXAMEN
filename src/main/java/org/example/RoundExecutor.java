package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class RoundExecutor {

    public List<Player> playRound(List<Player> players, String roundName) throws InterruptedException, ExecutionException {
        System.out.println("===== " + roundName + " =====");

        ExecutorService executor = Executors.newFixedThreadPool(players.size() / 2);
        List<Future<MatchResult>> futures = new ArrayList<>();

        for (int i = 0; i < players.size(); i += 2) {
            Match match = new Match(players.get(i), players.get(i + 1));
            Future<MatchResult> future = executor.submit(match);
            futures.add(future);
        }

        List<Player> winners = new ArrayList<>();

        for (Future<MatchResult> future : futures) {
            MatchResult result = future.get();
            System.out.println(result.getOutput());
            winners.add(result.getWinner());
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        return winners;
    }
}
