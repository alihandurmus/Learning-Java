package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String pass = "12345";
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir şifre giriniz : ");
        String password = scan.nextLine();

        if(pass.equals(password)){
            System.out.println("Şifre doğru");
        }
        else
            System.out.println("Şifre Yanlış");
    }
}
