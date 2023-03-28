package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac satir?");
        int sayi = scan.nextInt();

        for(int i = 0 ;i<=sayi;i++){
            int yedek = 1;
            for(int k=sayi;k>i;k--){
                System.out.print("\t\t");

            }
            for (int j = 0;j<i-1;j++){
                System.out.print(yedek+ "\t\t");
                yedek *= 4;
            }

            for(int z=0;z<i;z++){

                System.out.print(yedek+"\t\t");
                yedek/=4;
            }
            System.out.println();

        }
    }
}
