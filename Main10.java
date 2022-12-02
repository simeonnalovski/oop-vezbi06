package oop.fikt.vezbi06;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main10 {
    public static void main(String[] args){
        List <String> Gr1= Arrays.asList("Bitola","Prilep","Resen");
        List <String> Gr2 = Arrays.asList("Demir Hisar","Kicevo","Ohrid");
        List <String> Unija= new ArrayList<String>();
        Unija.addAll(Gr1);
        Unija.addAll(Gr2);
        System.out.println("Unija na listite "+Unija);
    }
}
