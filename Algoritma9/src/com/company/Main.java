package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int i = 0, j = 0;
        while ( i < 3 && j < 3 ) {
            System.out.println("Taş , Kağıt , Makas ?");
            int sayi = scan.nextInt();
            int bilgisayar = rand.nextInt(3);
            if(sayi>2||bilgisayar>2)
                System.out.println("ERROR!!! Sadece 0 1 2 Girebilirsin Tekrar Oyna!!");
            else {
                switch (sayi) {
                    case 0:
                        System.out.println("Kullanıcı : Taş");
                        break;
                    case 1:
                        System.out.println("Kullanıcı : Kağıt");
                        break;
                    case 2:
                        System.out.println("Kullanıcı : Makas");
                        break;
                }
                switch (bilgisayar) {
                    case 0:
                        System.out.println("Bilgisayar : Taş");
                        break;
                    case 1:
                        System.out.println("Bilgisayar : Kağıt");
                        break;
                    case 2:
                        System.out.println("Bilgisayar : Makas");
                        break;

                }
            }
            if (sayi == 0 && bilgisayar == 2 || sayi == 1 && bilgisayar == 0 || sayi == 2 && bilgisayar == 1) {
                System.out.println("Bu eli kullanıcı kazandı");
                i++;
            } else if (sayi == bilgisayar) {
                System.out.println("Bir daha oynayın!");
            } else if (sayi>2||bilgisayar>2){

            }

            else  {
                System.out.println("Bu eli Bilgisayar kazandı");
                j++;
            }
            System.out.println("Kullanıcı : " + i + " Bilgisayar : " + j);
        }
        if(i>j){
            System.out.println("Kullanıcı Kazandı!!");

        }
        else System.out.println("Bilgisayar Kazandı!!");
    }
}
