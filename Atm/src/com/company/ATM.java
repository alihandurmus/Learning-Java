package com.company;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int işlem;
        Hesap hesap = new Hesap("alihan123", "159753", 5000);
        Login login = new Login();
        System.out.println("----------------------------------");
        System.out.println("----Atm Programına Hoşgeldiniz----");
        System.out.println("----------------------------------");
        if(login.giris(hesap)) {
            System.out.println("Giriş Başarılı!!");
            boolean giriş = true;
            while (giriş) {
                System.out.println("Hangi işlemi yapmak istiyorsunuz?");
                System.out.println("1.Bakiye Öğrenme");
                System.out.println("2.Para Yatırma");
                System.out.println("3.Para Çekme");
                System.out.println("4.Çıkış");
                işlem = scanner.nextInt();
                switch (işlem) {
                    case 1:
                        System.out.println("Bakiyeniz : " + hesap.getBakiye());
                        break;
                    case 2:
                        System.out.println("Ne kadar para yatırmak istiyorsunuz?");
                        int para;
                        para = scanner.nextInt();
                        hesap.paraYatir(para);
                        break;
                    case 3:
                        System.out.println("Ne kadar para çekmek istiyorsunuz?");
                        int para1;
                        para1 = scanner.nextInt();
                        hesap.paraCek(para1);
                        break;
                    case 4:
                        System.out.println("Başarıyla çıkış yaptınız tekrar bekleriz.");
                        giriş = false;
                        break;
                    default:
                        System.out.println("Lütfen 1 ile 4 arasında bir işlem seçiniz!!");
                        break;
                }
            }
        }
        else
            System.out.println("Lütfen kullanıcı adını ve parolanızın doğru olduğundan emin olunuz.");

    }
}

