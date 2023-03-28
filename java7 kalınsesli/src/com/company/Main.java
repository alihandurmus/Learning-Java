package com.company;

public class Main {

    public static void main(String[] args) {
	  char karakter = 'b';
	  if(karakter == 'a' || karakter == 'ı' || karakter == 'o' || karakter == 'u'||karakter == 'e' || karakter == 'i' || karakter == 'ö' || karakter == 'ü') {
			if (karakter == 'a' || karakter == 'ı' || karakter == 'o' || karakter == 'u')
				System.out.println("Kalin sesli harftir");
			else
				System.out.println("Ince sesli harftir");
		}
	  else
	  	System.out.println("Sessiz harf girdiniz lütfen sesli harf giriniz");

    }
}
