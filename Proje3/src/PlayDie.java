public class PlayDie {
    public static void main(String[] args) {
     DiePlayer[] a = new DiePlayer[4];
     a[0] = new HoldAt20DiePlayer();
     a[1] = new HoldAt25DiePlayer();
     a[3] = new MyDiePlayer();
     a[2] = new RaceToGoalDiePlayer();

       DieGame d = new DieGame(a);
        System.out.println(d.play());

    }
}
