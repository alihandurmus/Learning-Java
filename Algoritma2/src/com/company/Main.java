package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int toplam = 0;
        int sayi = random.nextInt(1000);
        System.out.println("Random sayi : "+ sayi ) ;
        for(;sayi > 0;sayi = sayi/10 ){
            toplam = toplam + (sayi%10);
        }

        System.out.println("Random sayinin rakamları toplamı : "+toplam);
    }
}
