package com.company;

public class Main {

    public static void main(String[] args) {
	 int num1 = 17296 , num2 = 18416,toplam1 = 0,toplam2 = 0;
	  for(int x = 1 ;x<num1;x++ )
      {
          if(num1%x == 0)
              toplam1 += x;
          if(num2%x == 0)
              toplam2 += x;
      }
	      if(toplam1 == num2 && toplam2 == num1)
	          System.out.println("Girdiginiz sayilar arkadas sayilardir");
	      else
	          System.out.println("Girdiginiz sayilar arkadas sayi degildir");
    }
}
