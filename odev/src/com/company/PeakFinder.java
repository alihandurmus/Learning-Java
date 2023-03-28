package com.company;

import java.awt.*;
import java.util.Random;

public class PeakFinder {

    /**
     * generate random 2D array
     */
    public int[][] random2dArray(int n, int m){
        int[][] a = new int[n][];
        Random r = new Random();
        for(int i = 0; i < n; i++){
            a[i] = new int[m];
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = r.nextInt(20);
            }
        }
        return a;


    }
    public int[][][] random3dArray(int r,int c,int d){
        int[][][] a = new int[r][][];
        Random rand = new Random();
        for(int i = 0;i<r;i++){
            a[i] = new int[c][];
            for(int j=0;j<c;j++){
                a[i][j] = new int[d];
                for(int k = 0;k<d;k++){
                    a[i][j][k]=rand.nextInt(20);
                }
            }
        }
        return a;

    }
    public void print3d(int[][][] a){
        for (int[][] i: a){
            for (int[] item: i){

                for (int y:item){
                    System.out.print(y+"\t ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    public void print2d(int[][] a){
        for (int[] i: a){
            for (int item: i){
                System.out.print(item+"\t ");
            }
            System.out.println("");
        }
    }
    /**
     * n = number of rows,
     * m = number of columns
     * rowOrcol -> eger 0 ise sadece satirlari(n) bolecek
     *          eger 1 ise sadece sutunlari(m) bolecek
     *          eger 2 ise bir iterasyonda satirlari, diger iterasyonda sutunlari bolecek
     *              (m ve n degerlerinden buyuk olani bolebilirsiniz,
     *              bu m ve n degerleri arasaindaki fark fazla oldugunda daha mantikli.)
     */
    public int[] peakFinder2D(int[][] a, int n, int m, int rowOrcol){
        int[] indx = new int[2];
        int startR = 0, endR = n, startC = 0, endC = m;
        int mid;
        if(rowOrcol==0)
        {
            while (startR >= 0 && endR <= n) {
                mid = (startR + endR) / 2;
                int max = a[mid][startC];
                int imax = 0;
                for (int i = startC; i < endC; i++) {
                    if (max < a[mid][i]) {
                        max = a[mid][i];
                        imax = i;
                    }
                }
                //TODO edges------
                if (a[mid][imax] < a[mid + 1][imax]) {
                    startR = mid + 1;
                } else if (a[mid][imax] < a[mid - 1][imax]) {
                    endR = mid - 1;
                } else {
                    indx[0] = mid;
                    indx[1] = imax;
                    return indx;
                }
            }
        }
        if(rowOrcol==1) {
            while (startC >= 0 && endC <= m) {
                mid = ((startC + endC) / 2);
                int max = a[startR][mid];
                int imax = 0;
                for (int i = startR; i < endR; i++) {
                    if (max < a[i][mid]) {
                        max = a[i][mid];
                        imax = i;
                    }
                }
                if(a[imax][mid] < a[imax][mid+1]){
                    startC = mid + 1;
                }
                else if(a[imax][mid]<a[imax][mid-1]){
                    endC = mid - 1;
                }
                else{
                    indx[0] = imax;
                    indx[1] = mid;
                    return indx;
                }
            }
        }
        if(rowOrcol==2){
          if(m<=n){
              while (startR >= 0 && endR <= n) {
                  mid = (startR + endR) / 2;
                  int max = a[mid][startC];
                  int imax = 0;
                  for (int i = startC; i < endC; i++) {
                      if (max < a[mid][i]) {
                          max = a[mid][i];
                          imax = i;
                      }
                  }
                  //TODO edges------
                  if (a[mid][imax] < a[mid + 1][imax]) {
                      startR = mid + 1;
                  } else if (a[mid][imax] < a[mid - 1][imax]) {
                      endR = mid - 1;
                  } else {
                      indx[0] = mid;
                      indx[1] = imax;
                      return indx;
                  }
              }

          }
          else{
              while (startC >= 0 && endC <= m) {
                  mid = ((startC + endC) / 2);
                  int max = a[startR][mid];
                  int imax = 0;
                  for (int i = startR; i < endR; i++) {
                      if (max < a[i][mid]) {
                          max = a[i][mid];
                          imax = i;
                      }
                  }
                  if(a[imax][mid] < a[imax][mid+1]){
                      startC = mid + 1;
                  }
                  else if(a[imax][mid]<a[imax][mid-1]){
                      endC = mid - 1;
                  }
                  else{
                      indx[0] = imax;
                      indx[1] = mid;
                      return indx;
                  }
              }
          }
        }
        return indx;
    }
    /**
     * uc boyutlu arrayde peak bulan method
     * @param a
     * @param r
     * @param c
     * @param d
     * @return
     */
    public int[] peakFinder3d(int[][][] a, int r, int c, int d){
        int[] indx = new int[3];
        int startR = 0, endR = r;
        int startC = 0, endC = c;
        int startD = 0, endD = d;
        while(startD>= 0 && endD <= r)  {

            int mid = ((startD + endD) / 2);
            int max = a[startR][startC][mid];
            int imax = 0,jmax = 0;
            for(int i = 0;i < endR;i++){
                for(int j = 0;j < endC;j++){
                    if(max<a[i][j][mid]){
                        max = a[i][j][mid];
                        imax = i;
                        jmax = j;

                    }
                }
            }

            if(a[imax][jmax][mid]<a[imax][jmax][mid+1]){

               if(a[imax][jmax][mid+1]<a[imax+1][jmax][mid+1])
                   startR = imax+1;
               else if(a[imax][jmax][mid+1]<a[imax][jmax+1][mid+1])
                   startC = jmax +1;
               else if(a[imax][jmax][mid+1]<a[imax-1][jmax][mid+1])
                   endR = imax -1;
               else if(a[imax][jmax][mid+1]<a[imax][jmax-1][mid+1])
                   endC = imax - 1;


            }
            else if(a[imax][jmax][mid]<a[imax][jmax][mid-1]){

                if(a[imax][jmax][mid+1]<a[imax+1][jmax][mid-1])
                    startR = imax+1;
                else if(a[imax][jmax][mid+1]<a[imax][jmax+1][mid-1])
                    startC = jmax +1;
                else if(a[imax][jmax][mid+1]<a[imax-1][jmax][mid-1])
                    endR = imax -1;
                else if(a[imax][jmax][mid+1]<a[imax][jmax-1][mid-1])
                    endC = imax -1;

            }
            else{
                indx[0] = imax;
                indx[1] = jmax;
                indx[2] = mid;
                return indx;
            }


        }
        return indx;
    }

    public static void main(String[] args){
        PeakFinder pf = new PeakFinder();
        int m = 5, n = 5, rowOrcol = 0;
        int r=3,c=3,d=3;
        int[][] a = pf.random2dArray(n,m);
        int[][][] b = pf.random3dArray(r,c,d);
        long t1 = System.nanoTime();
        int x[] = pf.peakFinder2D(a, n, m, rowOrcol);
        long t2 = System.nanoTime();
        long tm1 = System.nanoTime();
        int y[] = pf.peakFinder3d(b ,r ,c ,d) ;
        long tm2 = System.nanoTime();

        System.out.println(x[0]+" "+x[1]);

        System.out.println(y[0]+" "+y[1]+" "+y[2]);



       // pf.print2d(a);// pf.print3d(b);


        System.out.printf("%d, %d, %d, %d", n,m, rowOrcol, t2-t1);
        /* TODO: int[] peak = pf.peakFinder2D(a, n, m, 855885963rowOrcol);
            is peak correct?
        */
    }
}
