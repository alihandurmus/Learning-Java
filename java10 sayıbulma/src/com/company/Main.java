package com.company;

public class Main {

    public static void main(String[] args) {
	   int[] sayilar = new int[]{1,2,5,7,8,9,10};
	   int aranacak = 5,x;
	   for(x = 0;;x++)
       {
           if(sayilar[x] == aranacak)
               break;
       }
	   x++;
	   System.out.println("Bulunmak istenen sayi "+x+".elemandir");
    }
}
