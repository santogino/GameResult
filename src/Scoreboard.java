import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Scoreboard {
    private List<GameResult> results;

    public Scoreboard() {
        this.results = new ArrayList<>();
    }

    public void addResult(GameResult result) {
        results.add(result);
    }

    public List<GameResult> showAllResults() {
        return new ArrayList<>(results);
    }

    public List<GameResult> sortedResultsDesc() {
        List<GameResult> sortedResults = new ArrayList<>(results);
        Collections.sort(sortedResults);
        Collections.reverse(sortedResults);
        return sortedResults;
    }

    public List<GameResult> showTopResults(int k) {
        if (k <= 0) {
            return new ArrayList<>();
        }
        List<GameResult> sortedResults = new ArrayList<>(results);
        Collections.sort(sortedResults);
        Collections.reverse(sortedResults);
        return sortedResults.subList(0, k);
    }

    public List<GameResult> getSuspanceResults(List<GameResult> originalResults) {
        //creare una lista di risultati ordinati in modo decrescente usando il comparator.comparing
        List<GameResult> sortedResult = new ArrayList<>(originalResults);
        sortedResult.sort(Comparator.comparing(GameResult::getPunteggio).reversed());

        //aggiungo i punteggi eliminando i primi 2 campi con subList
        List<GameResult> suspanceResult = new ArrayList<>();
        suspanceResult.addAll(sortedResult.subList(2, sortedResult.size()));

        //aggiungo i primi due punteggi alla fine
        suspanceResult.add(sortedResult.get(1));
        suspanceResult.add(sortedResult.get(0));
        return suspanceResult;
    }

}
