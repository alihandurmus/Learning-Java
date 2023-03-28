public class DieGame {
    public static final int GOAL_SCORE = 100;
    private DiePlayer[] players;
    private int[] scores;
    int myScore;
    int turnTotal;
    int maxScore;
    int rolls;
    public DieGame(DiePlayer[] players) {
        this.players = players;
        scores = new int[players.length];
        for(int i = 0;i<players.length;i++){
            scores[i]=0;
        }
    }
    int playTurn(DiePlayer p, int playerNum){
       Die d = new Die();
       int turToplam=0;
       int y;
       boolean t= p.isRolling(myScore,turnTotal,maxScore,rolls);
       do{
           y=d.nextRoll();
           turToplam += y;
         }
       while(t&&y!=1);
       if(t)
           return turToplam;
       else if(y==1)
           return 0;
       else return 0;


    }
    public int play(){
       int winner=0;

            for (int i = 0; i < players.length; i++) {
                while(scores[i]<100) {
                    scores[i] = playTurn(players[i], i);
                    if (scores[i] == 100)
                        break;
                }

            }


       for(int i = 0;i<scores.length;i++){
           if(scores[i]>winner)
               winner = scores[i];
       }

       for(int i = 0;i<scores.length;i++){
           if(winner==scores[i])
               winner = i;

       }

       printScores();
        return winner;
    }
    int getMaxScore(){
        int maxscore=0;
        for(int i = 0;i<scores.length;i++) {
            if (scores[i]>maxscore)
                maxscore = scores[i];
        }
        return maxScore;
    }
    void printScores(){
        for(int i = 0;i<scores.length;i++)
            System.out.println(scores[i]);

    }
}
