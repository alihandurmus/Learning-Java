package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indexini bulun.
	   Beden kitle indexi = Kilo / Boy(m) * Boy(m)
	 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcının Boyunu Giriniz");
        double boy = scan.nextDouble();
        System.out.println("Kullanıcının Kilosunu Giriniz");
        int kilo = scan.nextInt();
        double bki = kilo / (boy * boy);
        System.out.println("Kullanıcının Boyu:"+boy+"\nKullanıcının kilosu:"+kilo);
        System.out.println("Beden kitle indexi:"+bki);
        if(bki<18.5){
            System.out.println("Kullanıcı Zayıf");
        }
        else if(18.5<=bki&&bki<25){
            System.out.println("Kullanıcı Normal");

        }
        else if(25<=bki&&bki<30){
            System.out.println("Kullanıcı Fazla Kilolu");
        }
        else
            System.out.println("Kullanıcı Obez");
    }
}
