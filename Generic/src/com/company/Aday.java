package com.company;

public abstract class Aday {
    private String isim;
    private int turkce;
    private int matematik;
    private int fen;
    private int sosyal;


    public Aday(int turkce, int matematik, int fen, int sosyal,String isim) {
        this.isim = isim;
        this.turkce = turkce;
        this.matematik = matematik;
        this.fen = fen;
        this.sosyal = sosyal;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getFen() {
        return fen;
    }

    public void setFen(int fen) {
        this.fen = fen;
    }

    public int getSosyal() {
        return sosyal;
    }

    public void setSosyal(int sosyal) {
        this.sosyal = sosyal;
    }
    public abstract double TYTpuanHesapla();


}
