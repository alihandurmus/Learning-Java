package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SayiyiTersCevirme sayiyiTersCevirme = new SayiyiTersCevirme();
        for (int x = sayiyiTersCevirme.sayi(); x > 0; x = x / 10) {
            System.out.print(x % 10);
        }
        BasamakToplami basamakToplami = new BasamakToplami();
        int toplam = 0;
        for(int x= basamakToplami.sayi();x>0;x=x/10){
            toplam = toplam + (x%10);
        }
        System.out.println("Girdiginiz sayilarin basamak toplami:"+toplam);

    }
}
