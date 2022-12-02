package oop.fikt.vezbi06;
import java.util.ArrayList;
import java.util.List;
public class Main2 {
    public static void main(String [] args){
        List <String> Drzavi=new ArrayList <String>();
        Drzavi.add("Makedonija");
        Drzavi.add("Maroko");
        Drzavi.add("Avstralija");
        System.out.println(Drzavi.size());
        if(Drzavi.size()==3){
            Drzavi.add("Kanada");
            Drzavi.add("Brazil");
            System.out.println("Elementi na lista Drzavi "+Drzavi);
        } else{
            System.out.print("Elementi na lista Drzavi "+Drzavi);
        }
    }
}
