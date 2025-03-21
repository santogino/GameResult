public class GameResult implements Comparable<GameResult> {
    private String nickname;
    private int punteggio;

    public GameResult(String nickname, int punteggio) {
        this.nickname = nickname;
        this.punteggio = punteggio;
    }

    public String getNickname() {
        return nickname;
    }

    public int getPunteggio() {
        return punteggio;
    }

    @Override
    public int compareTo(GameResult altroRisultato) {
        GameResult risultato = altroRisultato;
        if (punteggio < risultato.getPunteggio()){
            return -1;
        }
        if (punteggio > risultato.getPunteggio()){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "nickname = " + nickname +
                ", punteggio = " + punteggio;
    }
}
