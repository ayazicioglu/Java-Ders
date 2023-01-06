package ders26_inheritance;

import java.util.ArrayList;
import java.util.List;

public class FDizelCorollla extends ECorolla{
    String motor="1.6 dizel motor";
    String yakit="Dizel";
    String guvenlik="ABS";
    String renk="renk belirtilmedi";

    public static void main(String[] args) {
        FDizelCorollla c1=new FDizelCorollla();
        System.out.println(c1.motor);// FDizel class
        System.out.println(c1.yakit);// FDizel class
        System.out.println(c1.guvenlik);// FDizel class
        System.out.println(c1.renk);// FDizel class

        System.out.println(c1.model);//ECorolla class
        System.out.println(c1.uretimYeri);// ECorolla class
        System.out.println(c1.teker);// ECorolla class
        System.out.println(c1.vites);// ECorolla class

        System.out.println(c1.marka);//DToyota class

        //Bazen child class'dan obje oluşturmakla beraber
        //bu child class'in parent class'dan hangi özellikleri
        //aldığını bilmek isteriz
        //Bu durumda data turunu constructor'ı kullanılan class'ın
        //parent class'larindan secebiliriz

        ECorolla c2=new FDizelCorollla();
        System.out.println(c2.motor);// ECorolla dan aramaya başlar, bulamayınnca gider Dtoyotada arar varsa ordan alır
        System.out.println(c2.yakit);// ECorolla dan aramaya başlar, bulamayınnca gider Dtoyotada arar varsa ordan alır
        //System.out.println(c2.guvenlik);// CTE verir üstlerde yok
        //System.out.println(c2.renk);// CTE verir üstlerde yok

        System.out.println(c2.model);// ECorolla dan aramaya başlar,
        System.out.println(c2.uretimYeri);// ECorolla dan aramaya başlar,
        System.out.println(c2.teker);// ECorolla dan aramaya başlar,
        System.out.println(c2.vites);// ECorolla dan aramaya başlar,

        System.out.println(c2.marka);// ECorolla dan aramaya başlar, bulamayınnca gider Dtoyotada arar varsa ordan alır

        DToyota c3=new FDizelCorollla();
        System.out.println(c3.motor);// DToyota class
        System.out.println(c3.yakit);// DToyota class
        //System.out.println(c3.guvenlik);// CTE
        //System.out.println(c3.renk);// CTE

        System.out.println(c3.model);//DToyota
        //System.out.println(c3.uretimYeri);// CTE
        //System.out.println(c3.teker);// CTE
        //System.out.println(c3.vites);// CTE

        System.out.println(c3.marka);//DToyota

        List<String> liste=new ArrayList<>();
    }
}
