package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

for( int x = scan.nextInt();x>0;x--) {
    for (int i=x ;i>0 ;i-- ) {
        System.out.print(i);

    }

    for(int j = 2 ; j<=x ; j++) {
        System.out.print(j);

    }
    System.out.println();
}

    }
}
