package com.company;

public class Main {

    public static void main(String[] args) {
	   int num = 28,toplam = 0;
	   for(int x = 1;x<num;x++)
       {
           if(num%x == 0)
               toplam += x;
       }
	   if(toplam == num)
	       System.out.println("Girdiginiz sayi mukemmel sayidir");
	   else
	       System.out.println("Girdiginiz sayi mukemmel sayi degildir");
    }
}
