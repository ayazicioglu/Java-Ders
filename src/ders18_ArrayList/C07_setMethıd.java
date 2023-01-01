package ders18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_setMethıd {
    public static void main(String[] args) {
        //java da bircok yapıda get ve set method'lrı bulunur
        //get metodları bilgiyi bize getirirken, bilgiyi update eder

        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler);//[A, Z, T]

        //2.indekse F elemanını ekleyin. add method2u var olan listeden herhangi bir elementi silmeden kaydırarak
        //ekleme yapar.

       harfler.add(2,"F");
        System.out.println(harfler);//[A, Z, F, T]

        //set method'u ise var olan elementi değiştirerek günceller

        harfler.set(2,"M");
        System.out.println(harfler);//[A, Z, M, T]




    }
}
