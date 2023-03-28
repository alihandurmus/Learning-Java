package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
     String mesaj = "   Bugün hava cok guzel   ";
     System.out.println(mesaj);

     /*System.out.println("Eleman sayisi : "+mesaj.length());
      System.out.println("5.eleman : "+mesaj.charAt(4));
      System.out.println(mesaj.concat(" Yasasin!"));
      System.out.println(mesaj.startsWith("B"));
      System.out.println(mesaj.endsWith("l"));
      char[] karakterler = new char[5];
      mesaj.getChars(0,5,karakterler,0);
      System.out.println(karakterler);
      System.out.println(mesaj.indexOf("av"));
      System.out.println(mesaj.lastIndexOf("a"));*/

        System.out.println(mesaj.replace(' ','-'));
        System.out.println(mesaj.substring(2));//2 den itibaren yazdırır.
        System.out.println(mesaj.substring(2,4));//2 den başla 4 e kadar gibi.
        for(String kelime : mesaj.split(" "))
            System.out.println(kelime);
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());//Başındaki ve sonundaki boşlukları siler.


    }
}
