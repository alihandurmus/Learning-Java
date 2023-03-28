package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 78;
        boolean asalMi = true;
        for(int i = 2;i<x;i++)
        {
            if(x%i == 0)
            {
                asalMi = false;
                break;
            }
            else
                asalMi = true;

        }
        if(x == 1)
            System.out.println("x sayisi asal degildir");

        else if(asalMi)
          System.out.println("x sayisi asaldir");
        else
          System.out.println("x sayisi asal degildir");
    }
}
