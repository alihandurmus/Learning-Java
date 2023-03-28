package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int sayi;
	int temp,temp1;
        int i;
        int toplam=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        sayi = scanner.nextInt();
        temp=sayi;
        temp1 = sayi;
        for (i =0;temp>0;i++){
            temp/=10;
        }
        while(temp1>0){

            toplam = (int) (toplam + Math.pow(temp1%10,i));
            temp1 = temp1/10;


        }
        System.out.println(toplam);
        if(sayi==toplam){
            System.out.println("Girdiğiniz sayi armstrong sayısıdır.");
        }
        else
            System.out.println("Girdiğiniz sayı armstrong sayısı değildir.");

    }
}
