package ders18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayLists {
    public static void main(String[] args) {
        String [] arr={"A","B","T"};
        //bu array e element olarak C eklemek istersek
        // ders16 icinde yaptığın c10 metodunu çağırarak yapabilirdik ama benim çağıramama sorunum devam ediyor


        //Alternatif olarak ArrayList esnek uzunluktaki bir array'dir.
        //Ancak ArrayList, array altyapısını kullandığından elementleri sadece tek tek ekleyebiliriz


        List<String> harfler=new ArrayList<>();
        System.out.println(harfler);//[]
        harfler.add("A");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);//[A, B, K]

        harfler.add(1,"C");//bu C yi ekler sağ tarafa öte gidin der
        System.out.println(harfler);//[A, C, B, K]

        harfler.add(3,"D");// 3e D yi eklemek istersek
        System.out.println(harfler);//[A, C, B, D, K]

        List<String> karakterler=new ArrayList<>();
        karakterler.add("*");
        karakterler.add("#");
        harfler.addAll(karakterler);
        System.out.println(harfler);//[A, C, B, D, K, *, #]

        harfler.addAll(2,karakterler);//2.indeksten sonraya eklemek istersek
        System.out.println(harfler);//[A, C, *, #, B, D, K, *, #]
    }
}
