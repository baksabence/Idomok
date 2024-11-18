package org.example;

import org.example.idomok.FaIdom;
import org.example.idomok.Gomb;
import org.example.idomok.Hasab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FaIdomok {
    private List<FaIdom> idomok;

    public FaIdomok() {
        idomok = new ArrayList<>();
        Gomb gomb1 = new Gomb(4);
        idomok.add(gomb1);
        Gomb gomb2 = new Gomb(6);
        idomok.add(gomb2);
        Hasab hasab1 = new Hasab(2,4,5);
        idomok.add(hasab1);
        Hasab hasab2 = new Hasab(4,6,8);
        idomok.add(hasab2);
    }

    public double osszSuly() {
//        double ossz = 0.0;
//        Iterator i1 = idomok.iterator();
//        while(i1.hasNext()){
//        Gomb gomb = (Gomb)i1.next();
//            if(gomb != null){
//
//            }
//        }
        double ossz = 0.0;
        for (FaIdom idom : idomok) {
            ossz += idom.suly();
        }
        return ossz;
    }

    public double osszGombSuly(){
        double ossz = 0.0;
        for (FaIdom idom : idomok) {
            if(idom instanceof Gomb){
                ossz += idom.suly();
            }
        }
        return ossz;
    }

    public FaIdom minV(){
        int min = 0;
        for (int i = 0; i < idomok.size(); i++) {
            FaIdom aktIdom =  idomok.get(i);
            FaIdom minIdom =  idomok.get(min);
            if(aktIdom.terfogat() < minIdom.terfogat()){
                min = i;
            }
            
        }
        return idomok.get(min);
    }

    public FaIdom maxV(){
        return idomok.get(0);
    }

    public void run(){
        for (FaIdom idom : idomok) {
            System.out.println(idom);
        }

        System.out.println("Idomok súlya: " + osszSuly());
        System.out.println("Gömbök súlya: " + osszGombSuly());
        System.out.println("Min V: " + minV() + "\n Max V: " + maxV());
    }

}
