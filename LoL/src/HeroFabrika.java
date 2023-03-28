public class HeroFabrika {
    public League HeroUret(String Hero_Ismi){
        if(Hero_Ismi.equals("Riven")){
            return new Riven("Riven",300,50,"Sürgün Kılıcı");
        }
        else if(Hero_Ismi.equals("Garen")){
            return new Garen("Garen",200,30,"Demacia'nın Adaleti");
        }
        else if(Hero_Ismi.equals("Zed")){
            return new Zed("Zed",350,50,"Ölüm İşareti");
        }
        else if(Hero_Ismi.equals("Jinx")){
            return new Jinx("Jinx",250,70,"Manyak Güçlü Ölüm Roketi");
        }
        else
            return null;
    }
}
