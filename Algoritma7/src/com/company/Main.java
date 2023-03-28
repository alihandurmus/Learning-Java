package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayiyi giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.println("İkinci sayiyi giriniz : ");
        int sayi2 = scan.nextInt();
        int ebob=0;

        for(int i = 1;i<=sayi1 && i<=sayi2;i++){
            if(sayi1%i==0&&sayi2%i==0){
                ebob = i;
            }
        }
        System.out.println("EBOB : "+ ebob);

    }
}
