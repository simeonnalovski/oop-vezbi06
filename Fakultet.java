package oop.fikt.vezbi06;
public class Fakultet {
    private String ime;
    private Integer vkupnoStudenti;
    private Integer brojSmerovi;
    public Fakultet(String ime, Integer vkupnoStudenti,Integer brojSmerovi){
        this.ime=ime;
        this.vkupnoStudenti=vkupnoStudenti;
        this.brojSmerovi=brojSmerovi;
    }
    
    public String getIme(){
        return ime;
    }
    public Integer getVkupnoStudenti(){
        return vkupnoStudenti;
    }
    public Integer getBrojSmerovi(){
        return brojSmerovi;
    }
}

