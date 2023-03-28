package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanıcı adı:");
        String nickname = scanner.nextLine();

        System.out.println("Şifre:");
        String password = scanner.nextLine();

        if(nickname.equals("alihan123")&&password.equals("159753")){
            System.out.println("Giriş başarılı");
        }
        else
            System.out.println("Giriş hatalı bidaha deneyiniz");
    }
}
