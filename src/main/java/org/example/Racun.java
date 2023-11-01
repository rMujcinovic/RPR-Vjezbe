package org.example;

public class Racun {

    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrek;
    private Double stanjeRac;


    public Racun(Long a, Osoba o) {
        brojRacuna = a;
        korisnikRacuna = o;
    }

    private boolean provjeriOdobrenjePrekoracenja(Double d) {
        if(odobrenjePrek){
            stanjeRac = d;
            return true;
        }
        else{
            return false;
        }
    }

    private boolean izvrsiUplatu(Double d) {
        if(d <= 0){
            return false;
        }
        else{
            stanjeRac += d;
            return true;
        }
    }

    private boolean izvrsiIslatu(Double d) {
        if(d <= 0 || d > stanjeRac){
            return false;
        }
        else{
            stanjeRac -= d;
            return true;
        }
    }

    public void odobriPrekoracenje(Double d) {
        odobrenjePrek = true;
    }

    public Long getBrojRacuna() {
        return brojRacuna;
    }

    public Osoba getKorisnikRacuna() {
        return korisnikRacuna;
    }

    public boolean isOdobrenjePrek() {
        return odobrenjePrek;
    }

    public Double getStanjeRac() {
        return stanjeRac;
    }

    public void setBrojRacuna(Long brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setKorisnikRacuna(Osoba korisnikRacuna) {
        this.korisnikRacuna = korisnikRacuna;
    }

    public void setOdobrenjePrek(boolean odobrenjePrek) {
        this.odobrenjePrek = odobrenjePrek;
    }

    public void setStanjeRac(Double stanjeRac) {
        this.stanjeRac = stanjeRac;
    }
}


