package com.company;

import java.util.Scanner;

public class Main {

    static boolean isAnagram(String a, String b) {

        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }
        for(int i = 0;i<a.length();i++){
            int sayac=0,sayac1=0;
            for(int j = 0;j<a.length();j++){
                if(a.substring(i,i+1).contains(a.substring(j,j+1))){
                    sayac++;

                }
                if(b.substring(j,j+1).toUpperCase().contains(a.substring(i,i+1).toUpperCase())){
                    sayac1++;
                }
            }

            if(sayac!=sayac1)
                return false;
        }
      return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);

        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
