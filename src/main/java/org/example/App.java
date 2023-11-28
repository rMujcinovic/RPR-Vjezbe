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
        // Kreiramo studenta
        InformacijeOStudentu student = new InformacijeOStudentu();
        student.setIme("John");
        student.setPrezime("Doe");
        student.setGodinaStudija("3");
        student.setBrojIndexa("12345");

        // Kreiramo predmet
        Predmet programiranje = new Predmet("Programiranje", "Učenje programiranja");

        // Student ocjenjuje predmet
        Ocjena ocjenaZaProgramiranje = student.ocijeni(9);
        programiranje.dodajOcjenu(ocjenaZaProgramiranje);

        // Prikazujemo informacije o predmetu i ocjeni
        System.out.println("Naziv predmeta: " + programiranje.getNaziv());
        System.out.println("Opis predmeta: " + programiranje.getOpis());
        System.out.println("Ocjena studenta: " + ocjenaZaProgramiranje.getOcjena());

        // Kreiramo nastavnika
        InformacijeONastavniku nastavnik = new InformacijeONastavniku("Profesor", "Smith", "Dr.");

        // Student ocjenjuje nastavnika
        Ocjena ocjenaZaNastavnika = student.ocijeni(8);
        nastavnik.ocijeni(ocjenaZaNastavnika.getOcjena());

        // Prikazujemo informacije o nastavniku i ocjeni
        System.out.println("Ime nastavnika: " + nastavnik.getIme());
        System.out.println("Titula nastavnika: " + nastavnik.getTitula());
        System.out.println("Ocjena studenta za nastavnika: " + ocjenaZaNastavnika.getOcjena());
    }
    }

