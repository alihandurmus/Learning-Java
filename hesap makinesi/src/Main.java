import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
	int islem;
        System.out.println("Hangi islemi yapmak istiyorsunuz??\n1.Toplama\n2.Cikarma\n3.Bolme\n4.Carpma");
        Scanner scanner = new Scanner(System.in);
        islem = scanner.nextInt();
	switch (islem){
        case 1 :
            dortIslem.Topla();
            break;
        case 2 :
            dortIslem.Cikar();
            break;
        case 3 :
            dortIslem.Bol();
            break;
        case 4 :
            dortIslem.Carp();
            break;
        default:
            System.out.println("Erorr Not Found!!");
    }
    }
}
