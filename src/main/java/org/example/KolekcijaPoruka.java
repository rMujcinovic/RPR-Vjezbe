package org.example;
import java.util.*;

public class KolekcijaPoruka {
    private final List<String> poruke;

    public KolekcijaPoruka(List<? extends LicneInformacije> listaInformacija) {
        this.poruke = new ArrayList<>();
        for (LicneInformacije informacije : listaInformacija) {
            this.poruke.add(informacije.getIme() + " " + informacije.getPrezime());
        }
    }

    public List<String> getPoruke() {
        return poruke;
    }
}
