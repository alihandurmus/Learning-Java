package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Login {
    public boolean giris(Hesap hesap){
        Scanner scanner = new Scanner(System.in);
        String kullaniciadi;
        String parola;

        System.out.println("Kullanıcı adını giriniz : ");
        kullaniciadi = scanner.nextLine();
        System.out.println("Parolayı giriniz : ");
        parola = scanner.nextLine();

        if(hesap.getKullaniciadi().equals(kullaniciadi)&&hesap.getParola().equals(parola)){
            return true;
        }
        else
             return false;

    }
}
