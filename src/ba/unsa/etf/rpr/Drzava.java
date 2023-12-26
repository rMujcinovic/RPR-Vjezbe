package ba.unsa.etf.rpr;

public class Drzava {

    private int id;
    private String naziv;
    private Grad glavniGrad;

    public Drzava() {}

    public Drzava(int id, String naziv, Grad glavniGrad) {
        this.id = id;
        this.naziv = naziv;
        this.glavniGrad = glavniGrad;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setGlavniGrad(Grad grad) {
        this.glavniGrad = grad;
    }

    public Grad getGlavniGrad() {
        return glavniGrad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String ispisiDrzavu() {
        return getNaziv() + " sa glavnim gradom " + getGlavniGrad().getNaziv();
    }
}
