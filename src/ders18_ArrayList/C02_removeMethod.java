package ders18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_removeMethod {
    public static void main(String[] args) {
        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        //harfler.remove("Z"); Zyi bulup siler ve görevi tamamladığı için true döner
        System.out.println(harfler.remove("Z"));//true döner
        System.out.println(harfler);//[A, T]

        System.out.println(harfler.remove(0));//0.indeksteki elementi siler ve görevi tamamlayıp silinen elementi
                                                    //bize döndürür. bu satır A döndürür
        System.out.println(harfler);//[T]

        List<String> yeniList=new ArrayList<>();
        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");

        System.out.println(yeniList.removeAll(harfler));//true
        System.out.println(yeniList);//[C, D]

    }
}
