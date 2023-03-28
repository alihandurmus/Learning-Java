package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Sayiyi giriniz : ");
        int sayi1 = scan.nextInt();
        int sayi2 = sayi1;

        for(int i = 2 ;i<sayi1;){
          if(sayi2%i==0){
              System.out.print(i+" ");
              sayi2/=i;
          }
          else
              i++;
        }
    }
}
