package com.example.listy;

public class Rzeczy {
    int Zdjecie;
    String tekst;

    public Rzeczy(int zdjecie, String tekst) {
        Zdjecie = zdjecie;
        this.tekst = tekst;
    }

    public int getZdjecie() {
        return Zdjecie;
    }

    public String getTekst() {
        return tekst;
    }

    public void setZdjecie(int zdjecie) {
        Zdjecie = zdjecie;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
}
