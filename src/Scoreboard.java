import java.util.ArrayList;
import java.util.Collections;
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
}
