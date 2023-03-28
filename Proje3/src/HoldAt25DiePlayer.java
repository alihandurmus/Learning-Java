public class HoldAt25DiePlayer implements DiePlayer{
    Die d = new Die();
    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {

        if(d.nextRoll()==1)
            return false;
        else if(turnTotal>=25)
            return false;
        else if(turnTotal+myScore>=100)
            return false;
        else

            return true;
    }
}
