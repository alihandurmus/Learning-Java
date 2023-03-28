package com.company;

import java.util.*;
public class Main {
    static boolean[][] toPrint = new boolean[][] {
            {
                    true,
                    true,
                    false
            }, {
            false,
            false,
            true
    }, {
            true,
            true,
            false
    }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = sc.nextBoolean();
        int choice = sc.nextInt();
        if (choice == 1){/*sample input true 1*/
            artPrint(toPrint, b);
        }else { /*get input from terminal: e.g true 1 1 1 true*/
            int n = sc.nextInt(), m = sc.nextInt();
            boolean[][] toPrint = new boolean[n][m];
            int j=0;

            for (boolean[] row: toPrint) {
                for (; j < row.length; j++) {
                    row[j] = sc.nextBoolean();
                }
            }
            artPrint(toPrint, b);
        }
    }

    static public void artPrint(boolean[][] toPrint, boolean printMirrorImage) {

        for(int x=0;x<toPrint.length;x++)
        {

            for (int y=0 ; y<toPrint[0].length ;y++)
            {
                if(toPrint[x][y] == true)
                    System.out.printf("X");
                else
                    System.out.printf(" ");

            }

            if(printMirrorImage==true)
            {
                int z = toPrint[0].length;
                while(z>0)
                {
                    if(toPrint[x][z-1] == true)

                        System.out.printf("X");

                    else

                        System.out.printf(" ");
                    z--;

                }
            }

            System.out.printf("\n");
        }
        //TODO
    }

}