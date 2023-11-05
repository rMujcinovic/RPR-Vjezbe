package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    private Map<String, TelefonskiBroj> imenik = new HashMap<String, TelefonskiBroj>();

    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime,broj);
    }

    public String dajBroj(String ime) throws NotInMapException {
        try{
            return imenik.get(ime).ispisi();
        }catch (NullPointerException e){
            throw new NotInMapException("Nema korisnika sa imenom: " + ime);
        }
    }

    public String dajIme(TelefonskiBroj broj) throws NotInMapException {
        for(Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet()){
            if(entry.getValue().equals(broj)){
                return entry.getKey();
            }
        }

        throw new NotInMapException("U mapi se ne nalazi trazeni korisnik!");
    }

    public String naSlovo(char s) throws NotInMapException {
        for(Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet()){
            if(entry.getKey().charAt(0) == s){
                return entry.getKey() + " - " + entry.getValue().ispisi();
            }
        }

        throw new NotInMapException("U mapi se ne nalazi korisnik čije ime počinje sa slovom: " + s);
    }

    Set<String> izGrada(Grad g){

        Set<String> skup = new TreeSet<String>();

        for(Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet()){
            if(entry.getValue() instanceof FiksniBroj && ((FiksniBroj)entry.getValue()).getGrad().equals(g)){
                skup.add(entry.getKey());
            }
        }

        return skup;
    }

    Set<TelefonskiBroj> izGradaBrojevi(Grad g){

        Set<TelefonskiBroj> skup = new TreeSet<TelefonskiBroj>();

        for(Map.Entry<String,TelefonskiBroj> entry : imenik.entrySet()){
            if(entry.getValue() instanceof FiksniBroj && ((FiksniBroj)entry.getValue()).getGrad().equals(g)){
                skup.add(entry.getValue());
            }
        }

        return skup;
    }
}
