package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi = scan.nextInt();

        String decimalString = "";

        for(int i = sayi;i>0;i/=2){
            decimalString = i%2 + decimalString;
        }
        System.out.println(decimalString);


    }
}
