package org.example;

public class Korisnik extends Osoba{

    private Racun racun;

    public Korisnik(String ime,String prezime){
        super(ime,prezime);
    }

    public void dodajRacun(Racun r){
        racun = r;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }
}


