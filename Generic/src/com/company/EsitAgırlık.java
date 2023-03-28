package com.company;

public class EsitAgırlık extends Aday{
    public EsitAgırlık(int turkce, int matematik, int fen, int sosyal, String isim) {
        super(turkce, matematik, fen, sosyal, isim);
    }

    @Override
    public double TYTpuanHesapla() {
        return (getTurkce()*1.3) + (getMatematik()*1.3) + (getFen()*1.4) + (getSosyal()*1.4);
    }
}
