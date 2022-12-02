package oop.fikt.vezbi06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main4 {
    public static void main(String[] args){
        List <Integer> Broevi= new ArrayList<Integer>();
        Broevi.add(90);
        Broevi.add(50);
        Broevi.add(70);
        Broevi.add(100);
        Broevi.add(80);
        Collections.sort(Broevi);
        System.out.println("Sortirani elementi na listata Broevi "+Broevi);
    }
}
