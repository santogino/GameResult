import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class GameResultTest {

    @Test
    void compareToMaggiore() {
        GameResult utente1 = new GameResult("Gino", 100);
        GameResult utente2 = new GameResult("Mario", 90);

        assertEquals(1, utente1.compareTo(utente2));
    }

    @Test
    void compareToMinore() {
        GameResult utente1 = new GameResult("Gino", 100);
        GameResult utente2 = new GameResult("Mario", 190);

        assertEquals(-1, utente1.compareTo(utente2));
    }

    @Test
    void compareToEquals() {
        GameResult utente1 = new GameResult("Gino", 100);
        GameResult utente2 = new GameResult("Mario", 100);

        assertEquals(0, utente1.compareTo(utente2));
    }

    @Test
    void compareToNegative() {
        GameResult utente1 = new GameResult("Gino", 100);
        GameResult utente2 = new GameResult("Mario", -90);

        assertEquals(1, utente1.compareTo(utente2));
    }

    @Test
    void compareToAllNegative() {
        GameResult utente1 = new GameResult("Gino", -100);
        GameResult utente2 = new GameResult("Mario", -90);

        assertEquals(-1, utente1.compareTo(utente2));
    }

    @Test
    void compareTo() {
        List<GameResult> results = new ArrayList<>();
        results.add(new GameResult("Gino", 100));
        results.add(new GameResult("Mario", 10));
        results.add(new GameResult("Lorenzo", 150));

        Collections.sort(results);

        assertEquals(10, results.get(0).getPunteggio());
    }

    @Test
    void compareToElement1() {
        List<GameResult> results = new ArrayList<>();
        results.add(new GameResult("Gino", 100));
        results.add(new GameResult("Mario", 10));
        results.add(new GameResult("Lorenzo", 150));

        Collections.sort(results);

        assertEquals(10, results.get(0).getPunteggio());
        assertEquals(100, results.get(1).getPunteggio());
        assertEquals(150, results.get(2).getPunteggio());

    }

    @Test
    void compareToElement2() {
        List<GameResult> results = new ArrayList<>();
        results.add(new GameResult("Gino", 100));
        results.add(new GameResult("Mario", 10));
        results.add(new GameResult("Lorenzo", 150));

        Collections.sort(results);

        assertEquals(150, results.get(2).getPunteggio());
    }
}