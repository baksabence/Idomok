package org.example.idomok;

public class Gomb extends FaIdom{
    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    public double terfogat(){
        return (4 * Math.pow(sugar, 3) * Math.PI) / 3;
    }

    @Override
    public String toString() {
        return "Gomb{" +
                "sugar=" + sugar +
                '}';
    }
}
