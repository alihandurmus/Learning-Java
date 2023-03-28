package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Ogrenciler {
    ArrayList<String> Ogrenciler = new ArrayList<String>();

    public void ogrencileriBastir(){
        System.out.println("Listenizde "+Ogrenciler.size()+" kadar öğrenci vardır.");
        for(int i = 0;i<Ogrenciler.size();i++){
            System.out.println((i+1)+". Öğrenci "+Ogrenciler.get(i));
        }
    }
    public void ogrenciEkle(String isim){

        Ogrenciler.add(isim);

    }
    public void ogrenciSil(int index){
        Ogrenciler.remove(index-1);
    }
    public void ogrenciGuncelle(String yeni_isim,int index){
        Ogrenciler.set(index-1,yeni_isim);
    }

}
