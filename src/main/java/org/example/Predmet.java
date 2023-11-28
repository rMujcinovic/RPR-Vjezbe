package org.example;
import java.util.*;

public class Predmet {
    private String naziv;
    private String opis;
    private List<Ocjena> ocjene;

    public Predmet(String naziv, String opis) {
        this.naziv = naziv;
        this.opis = opis;
        this.ocjene = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void dodajOcjenu(LicneInformacije osoba, int ocjena) {
        MozeOcijeniti mozeOcijeniti = (ocjena1) -> {
            Ocjena novaOcjena = new Ocjena(osoba, ocjena1);
            ocjene.add(novaOcjena);
            return novaOcjena;
        };

        mozeOcijeniti.ocijeni(ocjena);
    }
}
