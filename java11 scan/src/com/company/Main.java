package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(a);
        input.nextLine();//Bunu yapmamızın nedeni java da ilk string scanın atlaması bunu önlemek için yapıyoruz.
        String mesaj = input.nextLine();
        System.out.println(mesaj);
    }
}
