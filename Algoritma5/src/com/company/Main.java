package com.company;

public class Main {

    public static void main(String[] args) {
       int sayi = 2;
       int count = 0;

       while (count<50) {
           boolean isPrime = true;
           for (int i = 2; i < sayi; i++) {
                if(sayi%i == 0){
                    isPrime = false;
                }
           }
           if(isPrime){
               count++;
               if(count%10 == 0){
                   System.out.println(sayi);
               }
               else
                   System.out.print(sayi+" ");

           }

          sayi++;
       }
    }
}
