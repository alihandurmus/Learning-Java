public class MyMath {
    long factorial(int n)
    {
        int fact=1;
        if(n == 0)
            return 1;
        else
            {

            for(int i = 1;i<=n;i++)
            {
                fact *= i;
            }
            }
        return fact;
    }
    long fibonacci(int n)
    {

        if (n <= 1)
            return n;
        long l = fibonacci(n - 1) + fibonacci(n - 2);
        return l;
    }
    void printPyramidNumbers(int n)
    {

        for(int x = 1;x<=n;x++)
        {
            int sayi = 1;
            for(int y = 0;y<x;y++)
            {

                System.out.print(sayi);
                sayi++;
            }

            System.out.println();
        }
    }
    int gcd(int a,int b)
    {
        int ebob=0;
       if(a==0)
       {
           ebob = b;
       }
       else if(b == 0)
       {
           ebob = a;
       }
       else if(a == b)
       {
           ebob = a;
       }
       else if(a>b)
       {
           a = a-b;
           for(int i = 1;i<a;i++)
           {
               if(a%i==0&&b%i==0)
               {
                   ebob = i;
               }
           }
       }
       else if(b>a)
       {
           b = b-a;
           for(int i = 1;i<b;i++)
           {
               if(a%i==0&&b%i==0)
               {
                   ebob = i;
               }
           }
       }
        return ebob;
    }
    int lengthOfCollatzSeq(int n)
    {
        int sayac = 1;
      while(n!=1) {
          if (n % 2 == 0) {
              n /= 2;
          } else
              n = (n * 3) + 1;
          sayac++;
      }
      return sayac;
    }
    public static void main(String[] args) {
        MyMath math = new MyMath();
        System.out.println("1.Method \n"+math.factorial(6));
        System.out.println("2.Method  \n"+math.fibonacci(4));
        System.out.println("3.Method");math.printPyramidNumbers(4);
        System.out.println("4.Method\n"+math.gcd(54,24));
        System.out.println("5.Method  \n"+math.lengthOfCollatzSeq(6));

    }
}
