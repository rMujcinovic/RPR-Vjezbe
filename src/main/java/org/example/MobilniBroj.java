package org.example;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj {

    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    public MobilniBroj() {}

    @Override
    public String ispisi() {
        return  "0" + mobilnaMreza + "/" + broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilnaMreza,broj);
    }



    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    public void setMobilnaMreza(int mobilnaMreza) {
        this.mobilnaMreza = mobilnaMreza;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }
}
