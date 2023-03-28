package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sonuc,us,ust;
        for(int i=0;i<t;i++)
        {   sonuc = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sonuc += a;
            for(int x = 0;x<n;x++)
            {
                us = 2;
                ust = 1;
                for(int y = 0;y<x;y++)
                    ust = ust*us;
                if(x == 0)
                    sonuc = sonuc + b;
                else
                    sonuc = sonuc + b*ust;
                System.out.print(sonuc+" ");
            }
            System.out.println();

        }
    }
}
