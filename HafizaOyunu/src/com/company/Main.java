package com.company;

import java.util.Scanner;

public class Main {
    public static Kart[][] kartlar = new Kart[4][4];

    public static void main(String[] args) {
        System.out.println("Hafıza Kartı Oyununa Hoşgeldinizz!!");
        System.out.println("Aynı Kartları Tahmin Edin Hepsini Doğru Tahmin Ederseniz Oyun Biter Ve Kazanırsınız");
        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('A');
        kartlar[0][3] = new Kart('E');
        kartlar[1][0] = new Kart('B');
        kartlar[1][1] = new Kart('C');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('B');
        kartlar[2][0] = new Kart('C');
        kartlar[2][1] = new Kart('D');
        kartlar[2][2] = new Kart('F');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('G');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('F');
        kartlar[3][3] = new Kart('H');
        while (oyunBittiMi()==false){
            oyuntahtasi();
            tahminEt();
        }

    }
    public static void tahminEt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci tahmininizi giriniz i ve j değerlerini boşluklu olarak giriniz.");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        kartlar[i1][j1].setTahmin(true);
        oyuntahtasi();
        System.out.println("İkinci tahmininizi giriniz i ve j değerlerini boşluklu olarak giriniz.");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        if(kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger()){
            kartlar[i2][j2].setTahmin(true);
            System.out.println("Doğru Tahmin!!");
        }
        else {
            kartlar[i1][j1].setTahmin(false);
            System.out.println("Yanlış Tahmin...");
        }
        //oyuntahtasi();


    }
    public static void oyuntahtasi(){
        System.out.println("___________________");
        for(int i = 0;i<4;i++){
            for (int j = 0;j<4;j++){
                if(kartlar[i][j].isTahmin())
                System.out.print(" |"+kartlar[i][j].getDeger()+"| ");
                else System.out.print(" | | ");
            }
            System.out.println();
        }
        System.out.println("___________________");
    }
    public static boolean oyunBittiMi(){
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                if(kartlar[i][j].isTahmin() == false) {
                    return false;
                }

            }
        }
        System.out.println("Oyun Bitti Kazandınız Tebriklerr!!");
        return true;
    }
}
