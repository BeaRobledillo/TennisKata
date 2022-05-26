import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TennisGameTest {
    @Test
    void playersStartWithNoPoints() {
        TennisGame game = new TennisGame();
        int p1 = 0;
        int p2 = 0;
        assertThat(game.getScore(p1, p2), equalTo("0 - 0"));
    }

    @Test
    void playerScores15(){
        TennisGame game = new TennisGame();

        assertThat(game.playerScores(1), equalTo("Fifteen"));
    }

    // public String playerScores(int player){
    //      player1Score += 15;
    //      return "Fifteen";
    //  }


}

