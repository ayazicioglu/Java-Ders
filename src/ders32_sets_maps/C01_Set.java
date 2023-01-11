package ders32_sets_maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        //Collections, objelerden olusan bir topluluğu bir arada tutan yapılardır.
        //data türü olarak object secilirse icerisine her data türünden element konulabilir
        //Ancak bu durumda elementlere ulaşmak onları update etmek gibi işlemler normalden daha zor olabilir
        //hatta bazen mümkün olmayabilir
        Set<Object> karisikSet=new HashSet<>();
        karisikSet.add(12);
        karisikSet.add("Java");
        karisikSet.add('S');
        karisikSet.add(false);

        int[] arr=new int[3];
        arr[2]=23;
        karisikSet.add(arr);

        List<Object> karisikList=new ArrayList<>();
        karisikList.add("Hava");
        karisikList.add(44);
        karisikSet.add(karisikList);

        System.out.println(karisikList);//[Hava, 44]
        System.out.println(karisikSet);

        System.out.println(karisikSet.contains(44));//false
        System.out.println(karisikSet.contains(12));//true
        System.out.println(karisikSet.contains(23));//false

        System.out.println(karisikSet.size());//6
    }
}
