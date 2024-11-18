package org.example.idomok;

public abstract class FaIdom {
    private static double fajsuly = 0.8;

    abstract public double terfogat();

    public double suly(){
        return this.terfogat() * fajsuly;
    }

    @Override
    public String toString() {
        return "FaIdom{}";
    }
}
