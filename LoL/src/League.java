public class League {
    private String Hero;
    private int saldiriGucu;
    private int yetenekGucu;

    public String getHero() {
        return Hero;
    }

    public void setHero(String hero) {
        Hero = hero;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    public int getYetenekGucu() {
        return yetenekGucu;
    }

    public void setYetenekGucu(int yetenekGucu) {
        this.yetenekGucu = yetenekGucu;
    }



    public League(String hero, int saldiriGucu, int yetenekGucu) {
        Hero = hero;

        this.saldiriGucu = saldiriGucu;
        this.yetenekGucu = yetenekGucu;

    }
    public void saldir(){
        System.out.println(Hero+" "+saldiriGucu+" saldırı gücü ve "+yetenekGucu+"yetenek gücüyle saldırıyor...");

    }
    public void UltiAt(){
        System.out.println("Kahramanın ultisi bulunmamaktadır.");

    }
    public void bilgileriGoster(){
        System.out.println("Kahramanın ismi : "+Hero);
        System.out.println("Kahramanın saldırı gücü : "+saldiriGucu);
        System.out.println("Kahramanın yetenek gücü : "+yetenekGucu);
    }



}
