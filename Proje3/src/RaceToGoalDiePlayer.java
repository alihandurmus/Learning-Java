public class RaceToGoalDiePlayer implements DiePlayer{

    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        int tsi =myScore+turnTotal;
        if(tsi>=71||maxScore>=71){
            if(tsi>=100)
                return false;
            else return true;
        }
        else{
            if(turnTotal>=21 + Math.round((maxScore-tsi)/8))
                return false;
            else if(tsi>=100)
                return false;
            else return true;
        }

    }
}
