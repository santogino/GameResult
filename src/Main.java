import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(4);
        numbers.add(-2);
        numbers.add(25);
        numbers.add(33);
        numbers.add(7);

        Integer secondMax = FindSecondMax.findSecondMax(numbers);

        System.out.println("Il secondo numero più alto è: " + secondMax);

        Scoreboard scoreboard = new Scoreboard();
        scoreboard.addResult(new GameResult("Gino", 150));
        scoreboard.addResult(new GameResult("Mario", 120));
        scoreboard.addResult(new GameResult("Lorenzo", 250));
        scoreboard.addResult(new GameResult("Vincent", 110));
        scoreboard.addResult(new GameResult("Michele", 180));

        System.out.println("Tutti i risultati:");
        List<GameResult> allResults = scoreboard.showAllResults();
        for (GameResult result : allResults) {
            System.out.println(result);
        }

        System.out.println("Tutti i risultati Ordinati:");
        List<GameResult> allResultsSorted = scoreboard.sortedResultsDesc();
        for (GameResult sortedResult : allResultsSorted) {
            System.out.println(sortedResult);
        }

        System.out.println("Top 3 risultati:");
        for (GameResult topResults : scoreboard.showTopResults(4)) {
            System.out.println(topResults);
        }
    }
}