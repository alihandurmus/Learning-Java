import java.util.Scanner;

 class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            for(int y=0;y<15;y++){
                if(s1.length()<15)
                    s1 = s1.concat(" ");
            }
            if(x<10)
                System.out.println(s1+"00"+x);
            else if(x<100)
                System.out.println(s1+"0"+x);
            else
                System.out.println(s1+x);



        }

        System.out.println("================================");

    }
}
