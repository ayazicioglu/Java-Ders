package ders31_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

    public static void main(String[] args) {
        //Deque double ended queue demektir.
        //İki yönlü kuyruk
        //Bu iki yönlü yapısından dolayı pekçok method'un first() ve last() versiyonu vardır.

        Deque<String> harfler=new LinkedList<>();
        harfler.add("J");
        harfler.add("L");

        System.out.println(harfler);//[J, L]
        harfler.addFirst("B");
        System.out.println(harfler);//[B, J, L]

        System.out.println(harfler.removeFirst());// B B'yi sildi ve bize B döndürdü
        System.out.println(harfler);//[J, L]

        harfler.addFirst("A");
        harfler.addLast("A");
        harfler.add("K");
        System.out.println(harfler);//[A, J, L, A, K]

        // sona doğru olan A'yi silelim
        System.out.println(harfler.removeLastOccurrence("A"));// true
        System.out.println(harfler);//[A, J, L, K]

        System.out.println(harfler.removeLastOccurrence("T"));//false >aradım bulamadım false döndüm diyor

        LinkedList<String> karakterler=new LinkedList<>();// objeyi böyle oluşturunca 3 parent'in methodlarını da
        // override etmek zorunda olacağından zibilyon tane method görebilirsin
        //karakterler. yazıp denemesi bedeva

        karakterler.push("A");
        karakterler.push("B");
        System.out.println(karakterler);//[B, A] push addFirst ile aynı işlemi yapıyor

        System.out.println(karakterler.clone());//[B, A]

        LinkedList<String> kopyaKarakterler= (LinkedList<String>) karakterler.clone();
        System.out.println(kopyaKarakterler);//[B, A]

    }


}
