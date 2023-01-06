package ders25_inheritance;

public class DToyota extends CCar{

    DToyota(){
        System.out.println("parametresiz Toyota constructor'ı çalıştı");
    }
    DToyota(String par1){
        System.out.println("Parametreli Toyota constructor'ı çalıştı");
    }
    String marka="Toyota";
    String uretimYeri="Toyota farkli ülkelerde üretilir";
}
