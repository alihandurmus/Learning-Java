package com.company;

public class Main {
    public static int ebobbul(int sayi1,int sayi2){
        int ebob=0;
        if(sayi1>sayi2) {
            for (int i = 1; i <=sayi2;i++ ){
                if(sayi1%i==0&&sayi2%i==0){
                    ebob=i;
                }
            }
        }
        else
        {
            for (int i = 1; i <=sayi1;i++ ){
                if(sayi1%i==0&&sayi2%i==0){
                    ebob=i;
                }
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
	    int ebob = ebobbul(36,48);
        System.out.println("Sayiların ebobu "+ebob);

    }
}
