package org.example.idomok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasabTest {

    Hasab teszt;

    @Test
    void getA() {
        System.out.println("Teszt getA: ");
        double kapott = teszt.getA();
        double vart = 2;
        Assertions.assertEquals(vart, kapott);
    }

    @Test
    void setA() {
    }

    @Test
    void getB() {
    }

    @Test
    void setB() {
    }
}