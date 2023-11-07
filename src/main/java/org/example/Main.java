package org.example;

import java.util.Set;

public class Main
{
    public static void main( String[] args )
    {
        FiksniBroj fb = new FiksniBroj(Grad.TUZLA,"223-523");
        FiksniBroj fb1 = new FiksniBroj(Grad.TUZLA,"123-424");
        Imenik imenik = new Imenik();
        imenik.dodaj("Refik", fb);
        imenik.dodaj("Amer", fb1);


        char c = 'R';
        /*try{
            System.out.println(imenik.naSlovo(c));
        }catch (NotInMapException e){
            System.out.println(e.getMessage());
        }*/

        Set<TelefonskiBroj> skup = imenik.izGradaBrojevi(Grad.TUZLA);
        for(TelefonskiBroj broj : skup){
            System.out.println(broj.ispisi());
        }
    }
}
