package org.example;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj implements Comparable<FiksniBroj> {
    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }



    public FiksniBroj() {}

    @Override
    public String ispisi() {
        return grad.toString() + "/" + broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(broj,grad);
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public int compareTo(FiksniBroj br) {
        return this.ispisi().compareTo(br.ispisi());
    }
}
