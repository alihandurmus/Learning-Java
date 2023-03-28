import java.util.Scanner;

public class UserDiePlayer implements DiePlayer {


    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        System.out.println("Tur toplami:"+turnTotal);
        Scanner s = new Scanner(System.in);
        System.out.println("Roll or Hold?");
        String q;
        q = s.nextLine();
        if(q=="")
            return true;
            else
            return false;
    }

}
