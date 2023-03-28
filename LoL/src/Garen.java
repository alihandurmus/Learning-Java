public class Garen extends League{
    private String Ulti;

    public String getUlti() {
        return Ulti;
    }

    public void setUlti(String ulti) {
        Ulti = ulti;
    }

    public Garen(String Hero, int saldırıGucu, int yetenekGucu, String Ulti){
        super(Hero,saldırıGucu,yetenekGucu);
        this.Ulti = Ulti;

    }

    @Override
    public void UltiAt() {
        System.out.println(getHero()+" "+Ulti+" ile saldırı gerçekleştiriyor...");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kahramanın ultisi "+Ulti);
        System.out.println("Kahramanın pasif yeteneği : Metanet");

    }
}
