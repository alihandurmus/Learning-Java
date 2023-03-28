package com.company;

import java.util.Scanner;

public class Main {
     public static Ogrenciler ogrenciler = new Ogrenciler();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
         boolean dongu = true;
        System.out.println("Ogrenci sistemine hoşgeldiniz..");

        System.out.println("1.İşlemleri Yeniden Göster");
        System.out.println("2.Öğrenciler Göster");
        System.out.println("3.Öğrenci Ekle");
        System.out.println("4.Öğrenci Sil");
        System.out.println("5.Öğrenci Güncelle");
        System.out.println("6.Programdan Çık");
        while (dongu) {
            System.out.println("Hangi işlemi yapmak istiyorsunuz ?");
            int islem = scanner.nextInt();
            scanner.nextLine();
            switch (islem) {
                case 1:
                    islemleriGoster();
                    break;
                case 2:
                    ogrenciGoster();
                    break;
                case 3:
                    System.out.println("Eklemek istediğiniz öğrencinin ismini yazınız.");
                    String isim = scanner.nextLine();
                    ogrenciEkle(isim);
                    System.out.println("Öğrenci başarıyla eklenmiştir!!");
                    break;
                case 4:
                    System.out.println("Silmek istediğiniz öğrencinin numarısını giriniz.");
                    int index = scanner.nextInt();
                    if(ogrenciler.Ogrenciler.size()==0){
                        System.out.println("Listenizde öğrenci yoktur silme işlemi yapamazsınız");
                    }
                    else if(ogrenciler.Ogrenciler.size()>=index) {
                        ogrenciSil(index);
                        System.out.println("Silme işlemi başarıyla gerçekleşmiştir.");
                    }

                    else
                        System.out.println("Silmek istediğiniz öğrenci bulunamamıştır!!");

                    break;
                case 5:
                    if(ogrenciler.Ogrenciler.size()==0){
                        System.out.println("Listede öğrenci bulunmamaktadır güncelleme işlemi yapamazsınız!!");
                        break;
                    }
                    System.out.println("Güncellemek istediğiniz öğrencinin numarasını giriniz.");
                    index = scanner.nextInt();
                    scanner.nextLine();

                    if(ogrenciler.Ogrenciler.size()<index){
                        System.out.println("Listede bu numaralı öğrenci bulunmamaktadır!!");
                    }
                    else {
                        System.out.println("Yeni öğrencinin ismi nedir ? ");
                        String yeni_isim = scanner.nextLine();
                        ogrenciGuncelle(yeni_isim, index);
                        System.out.println("Güncelleme işlemi başarıyla gerçekleşmiştir..");
                    }
                    break;
                case 6:
                    dongu = false;
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Lütfen geçerli işlem seçiniz!!");
            }
        }


    }
    public static void islemleriGoster(){
        System.out.println("1.İşlemleri Yeniden Göster");
        System.out.println("2.Öğrenciler Göster");
        System.out.println("3.Öğrenci Ekle");
        System.out.println("4.Öğrenci Sil");
        System.out.println("5.Öğrenci Güncelle");
        System.out.println("6.Programdan Çık");
    }
    public static void ogrenciGoster(){
        ogrenciler.ogrencileriBastir();
    }
    public static void ogrenciEkle(String isim){

        ogrenciler.ogrenciEkle(isim);
    }
    public static void ogrenciSil(int index){

        ogrenciler.ogrenciSil(index);
    }
    public static void ogrenciGuncelle(String yeni_isim,int index){

        ogrenciler.ogrenciGuncelle(yeni_isim,index);
    }
}
