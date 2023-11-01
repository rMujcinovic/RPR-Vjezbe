package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class App {

    public static void main( String[] args ) {


        Scanner ulaz = new Scanner(System.in);
        List<Double> lista = new LinkedList<>();



        while(true){

            System.out.println("Unesite elemente liste '(stop)' za kraj: ");
            String unos = ulaz.nextLine();

            if(unos.equals("stop")){
                break;
            }
            else{
                try{
                    Double x = Double.parseDouble(unos);
                    lista.add(x);
                }
                catch(Exception e){
                    System.out.println("Pogresan unos!");
                }
            }
        }

        double min = min(lista);
        double max = max(lista);


        double suma = 0;
        for(Double x : lista){
            suma += x;
        }
        double average = suma/lista.size();


        double varijansa = 0;
        for (Double a: lista) {
            varijansa += Math.pow(a - average, 2);
        }


        double sd = Math.sqrt(varijansa/ lista.size() - 1);

        System.out.println("Najmanji element u listi je: " + min);
        System.out.println("Najveci element u listi je: " + max);
        System.out.println("Srednja vrijednost elemenata liste je: " + average);
        System.out.println("Standardna devijacija elemenata liste je: " + sd);

    }
}


