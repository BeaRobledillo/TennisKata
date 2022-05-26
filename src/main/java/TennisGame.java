public class TennisGame {


    int player1Score = 0;
    int player2Score = 0;

    public String getScore(int player1Score, int player2Score){
        return (player1Score + " - " + player2Score); // 0 - 0
    }
    public String playerScores(int playerNum){

        if (playerNum == 1){
            player1Score += 15;
            return sayScorePlayer(player1Score);
        }else if(playerNum == 2){
            player2Score += 15;
            return sayScorePlayer(player2Score);
        }else{
            return "player not found";
        }
    }
    public String sayScorePlayer(int player){
        if (player == 15){
            return "Fifteen";
        }else{
            return "otra cosa";
        }
    }
    public String resetScore(){
        player1Score = 0;
        player2Score = 0;
        return getScore(player1Score, player2Score);
    }

}