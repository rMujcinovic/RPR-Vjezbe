package org.example;
import java.util.*;

public class InformacijeONastavniku extends LicneInformacije implements MozeOcijeniti {
    private String titula;
    private List<Ocjena> ocjene;

    public InformacijeONastavniku(String ime, String prezime, String titula) {
        setIme(ime);
        setPrezime(prezime);
        this.titula = titula;
        this.ocjene = new ArrayList<>();
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    @Override
    public Ocjena ocijeni(int ocjena) {
        MozeOcijeniti mozeOcijeniti = (ocjena1) -> {
            Ocjena novaOcjena = new Ocjena(this, ocjena1);
            ocjene.add(novaOcjena);
            return novaOcjena;
        };

        return mozeOcijeniti.ocijeni(ocjena);
    }
}
