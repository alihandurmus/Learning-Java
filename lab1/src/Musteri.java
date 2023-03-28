/*
Alihan Durmuş
20120205028
Bu program classlarla çalışmayı pekiştirmek için yazılmıştır.
 */
public class Musteri {//Burada musteri classını tanımladık.
    String isim;
    int hesapNO;
    int bakiye;

    public Musteri(String isim, int hesapNO, int bakiye) {//Burada Musteri Constructor ını tanımladık.
        this.isim = isim;
        this.hesapNO = hesapNO;
        this.bakiye = bakiye;
    }
    public static void main(String[] args) {
        Musteri musteri1 = new Musteri("Ali ",111,3000);//main kısmında musteri1 ve musteri 2 olmak üzere 2 tane nesne tanımladık.
        Musteri musteri2 = new Musteri("Ayse ",222,2000);
        System.out.println("1.musterinin ismi:"+ musteri1.isim+"\n1.musterini hesap nosu:"+ musteri1.hesapNO+"\n1.musterinin bakiyesi:"+musteri1.bakiye);//Burada musteri nesnelerimizin isim hesapno ve bakiyesini yazdırdık.
        System.out.println("2.musterinin ismi:"+ musteri2.isim+"\n2.musterini hesap nosu:"+ musteri2.hesapNO+"\n2.musterinin bakiyesi:"+musteri2.bakiye);
        System.out.println("Bakiye farki:" +Math.abs(musteri1.bakiye- musteri2.bakiye));//Burada musteri nesnelerimizin bakiye farkını yazdırdık.

    }
}
