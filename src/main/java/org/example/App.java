package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Primjeri korištenja klasa

        // LicneInformacije
        LicneInformacije osoba = new LicneInformacije();
        osoba.setIme("Jon");
        osoba.setPrezime("Jones");
        System.out.println("Ime: " + osoba.getIme());
        System.out.println("Prezime: " + osoba.getPrezime());

        // InformacijeOStudentu
        InformacijeOStudentu student = new InformacijeOStudentu();
        student.setIme("Charles");
        student.setPrezime("Oliveira");
        student.setGodinaStudija("3");
        student.setBrojIndexa("12345");
        System.out.println("Ime studenta: " + student.getIme());
        System.out.println("Godina studija: " + student.getGodinaStudija());
        System.out.println("Broj indexa: " + student.getBrojIndexa());

        // InformacijeONastavniku
        InformacijeONastavniku nastavnik = new InformacijeONastavniku();
        nastavnik.setIme("Profesor");
        nastavnik.setPrezime("McGregor");
        nastavnik.setTitula("Dr.");
        System.out.println("Ime nastavnika: " + nastavnik.getIme());
        System.out.println("Titula: " + nastavnik.getTitula());

        // Predmet
        Predmet predmet = new Predmet();
        predmet.setNaziv("Programiranje");
        predmet.setOpis("Učenje programiranja");
        System.out.println("Naziv predmeta: " + predmet.getNaziv());
        System.out.println("Opis predmeta: " + predmet.getOpis());

        // KolekcijaPoruka
        List<LicneInformacije> listaInformacija = new ArrayList<>();
        listaInformacija.add(osoba);
        listaInformacija.add(student);
        listaInformacija.add(nastavnik);

        KolekcijaPoruka kolekcijaPoruka = new KolekcijaPoruka(listaInformacija);
        List<String> poruke = kolekcijaPoruka.getPoruke();

        System.out.println("\nPoruke:");
        for (String poruka : poruke) {
            System.out.println(poruka);
        }
    }
}
