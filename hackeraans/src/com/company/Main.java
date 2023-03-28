package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int sayac=0;

        String tokens = "[ !,?._'@]";
        String[] arr = s.split(tokens);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==""){

            }
        }





        for(int i=0;i<arr.length;i++){
            if(arr[i]!=""){
                sayac++;
            }
        }
        System.out.println(sayac);
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=""){
                System.out.println(arr[i]);
            }

        }

        scan.close();
    }
}
