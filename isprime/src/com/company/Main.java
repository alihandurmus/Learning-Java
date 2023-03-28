package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        boolean isPrime=true;

        if(Integer.parseInt(n) == 2) isPrime=true;
        else {
            for (int i = 2; i < Integer.parseInt(n); i++) {
                if (Integer.parseInt(n) % i == 0) {
                    isPrime = false;
                    break;
                } else
                    isPrime = true;
            }
        }


        if(isPrime)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
    }

