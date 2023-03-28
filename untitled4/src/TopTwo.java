import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TopTwo {
    public static void main(String args[] ){
        int j=0;

        for(;j<toPrint.length;j++){

            int i=0;
            for (;i<toPrint[0].length  ;i++){
                if(toPrint[j][i] == true)
                    System.out.printf("X");
                else
                    System.out.printf(" ");

            }
            if(printMirrorImage==true){
                int a = toPrint[0].length;
                while(a>0){
                    if(toPrint[j][a-1] == true)
                        System.out.printf("X");
                    else
                        System.out.printf(" ");

                    a--;
                }
            }

            System.out.printf("\n");
        }
    }
}
