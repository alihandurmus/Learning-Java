import java.util.Scanner;

public class DortIslem {
    public void Topla(){
        float a,b,toplam;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplamak istediginiz sayilari giriniz");
        a = scanner.nextInt();
        b= scanner.nextInt();
        toplam = a+b;
        System.out.println("Toplama sonucu : "+toplam);


    }
    public void Cikar(){
        float a,b,sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cikarmak istediginiz sayilari giriniz");
        a = scanner.nextInt();
        b= scanner.nextInt();
        sonuc = a-b;
        System.out.println("Cikarma sonucu : "+sonuc);
    }
    public void Bol(){
        float a,b,sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bolmek istediginiz sayilari giriniz");
        a = scanner.nextInt();
        b= scanner.nextInt();
        sonuc = a/b;
        System.out.println("Bolme sonucu : "+sonuc);
    }
    public void Carp(){
        float a,b,sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Carpmak istediginiz sayilari giriniz");
        a = scanner.nextInt();
        b= scanner.nextInt();
        sonuc = a*b;
        System.out.println("Carpma sonucu : "+sonuc);
    }
}
