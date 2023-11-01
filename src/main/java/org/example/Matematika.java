package org.example;

public class Matematika {
    public static long faktorijel(int x) throws NeispravanParametarException {
        long fact = 1;
        if (x < 0) {
            throw new NeispravanParametarException("Neispravan parametar - negativna vrijednost!");
        } else if (x == 0) {
            return 1;
        }
        else {
            for (int i = 2; i <= x; i++) {
                fact *= i;
            }
        }

        return fact;
    }

    public static double sinus(int x) throws NeispravanParametarException {
        double sin = 0;

        for(int i = 1; i <= 10; i++){
            sin += Math.pow(1,i) * Math.pow(x,2 * i + 1) / Matematika.faktorijel(2 * i + 1);
        }

        return sin;
    }
}