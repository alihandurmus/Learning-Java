package com.company;

public class Hesap {
   private String kullaniciadi;
    private String parola;
    private int bakiye;


    public Hesap(String kullaniciadi, String parola, int bakiye) {
        this.kullaniciadi = kullaniciadi;
        this.parola = parola;
        this.bakiye = bakiye;
    }
    public void paraYatir(int para){
        bakiye += para;
        System.out.println("Yeni bakiyeniz : "+bakiye);
    }
    public void paraCek(int para){
        if((bakiye-para)<0){
            System.out.println("Yeterli Bakiyeniz yok.");

        }
        else {
            bakiye -= para;
            System.out.println("Yeni bakiyeniz : "+bakiye);
        }

    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public String getParola() {
        return parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

}
