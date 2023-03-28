package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String word = scan.nextLine();
        String rewWord = "";
        System.out.println("Girdiğiniz kelime : "+word);
        for(int i = 0;i<word.length();i++){
            rewWord += word.charAt(word.length()-i-1);
        }
        System.out.println("Girdiğiniz kelimenin tersi : "+rewWord);
        if(rewWord.equals(word)){
            System.out.println("Girdiğiniz kelime polindrom kelimedir.");
        }else
            System.out.println("Girdiğiniz kelime polindrom kelime değildir.");
    }
}
