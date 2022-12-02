package oop.fikt.vezbi06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main11 {
    public static void main(String[] args){
        List <String> Gr1= Arrays.asList("Bitola","Prilep","Resen");
        List <String> Gr2 = Arrays.asList("Demir Hisar","Bitola","Ohrid");
        List <String> Presek=(List<String>) Gr1.stream().filter(Gr2::contains).collect(Collectors.toList());
        System.out.println("Presek na listite "+Presek);
        // vo linija 11 se vo listata Presek se vpisuva celata lista Gr1, pa se zadrzuvaat samo zaednickite elementi so lista Gr2

    }
}
