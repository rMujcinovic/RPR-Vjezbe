package org.example;

public enum Grad {
    SARAJEVO("033"), TUZLA("035"), ZENICA("032"), BRCKO("049");

    private final String value;


    Grad(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }


}
