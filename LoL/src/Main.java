import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("League'e Hoşgeldiniz!!");
        boolean dongu=true;
        while (dongu) {

            System.out.println("Kahraman üretmek için 1 e basın");
            System.out.println("Programdan çıkmak için 2 ye basın");
            Scanner scanner = new Scanner(System.in);
            int islem = scanner.nextInt();
            scanner.nextLine();


            switch (islem) {
                case 1:
                     System.out.println("Hangi Kahramanı üretmek istiyorsunuz?");
                     String Hero = scanner.nextLine();
                     HeroFabrika fabrika = new HeroFabrika();
                     League league = fabrika.HeroUret(Hero);
                     if(league == null){
                         System.out.println("Lütfen geçerli bir kahraman ismi giriniz");
                     }
                     else
                     {
                         league.bilgileriGoster();
                         league.saldir();
                         league.UltiAt();
                     }
                     break;
                case 2:
                    System.out.println("Programdan çıkılıyorr....");
                    dongu = false;
                    break;
                default:
                    System.out.println("Lütfen geçerli bir işlem seçiniz!!");
            }
        }

    }
}
