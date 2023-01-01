package ders18_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_RemoveIntMet {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(9);

        System.out.println(sayilar);//[10, 5, 7, 9]

        //sayilar.remove(5);//eğer listemiz Integer'lardan olusuyorsa parametre olarak yazdigimiz sayinin
                                // index mi yoksa obje mi oldugu belirsiz olmasın diye Java otomatik olarak
                                //index kabul eder. öbür türlü indexBoundofRange hatası verir

        Integer silinecekElement=5;
        System.out.println(sayilar.remove(silinecekElement));//true
        System.out.println(sayilar);//[10, 7, 9]

    }
}
