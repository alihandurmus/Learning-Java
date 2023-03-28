import java.util.Random;
import java.util.Scanner;

public class MyDiePlayer implements DiePlayer{
    Die d = new Die();
    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
          if(d.nextRoll()==1)
          return false;
          else if(turnTotal>=40)
              return false;
          else if(turnTotal+myScore>=100)
              return false;
          else return true;
    }
}
