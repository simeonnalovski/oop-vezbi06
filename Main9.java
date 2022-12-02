package oop.fikt.vezbi06;
import java.util.List;
import java.util.ArrayList;
public class Main9 {
    public static void main(String[] args){
        List <Fakultet> faks= new ArrayList<Fakultet>();
        Fakultet fakultet1= new Fakultet("FIKT", 400, 3);
        faks.add(fakultet1);
        Fakultet fakultet2= new Fakultet("Praven Bt", 300, 2);
        faks.add(fakultet2);
        Fakultet fakultet3=new Fakultet("FBN", 200, 5);
        faks.add(fakultet3);
        Fakultet fakultet4= new Fakultet("Visoka Medicinska Skola", 250, 4);
        faks.add(fakultet4);
        Fakultet fakultet5=new Fakultet("Tehnicki fakultet", 260, 6);
        faks.add(fakultet5);
        for(int i=0;i<faks.size();i++){
            System.out.println(faks.get(i).getIme());
            System.out.println(faks.get(i).getBrojSmerovi());
            System.out.println(faks.get(i).getVkupnoStudenti());
        }

    }
}
