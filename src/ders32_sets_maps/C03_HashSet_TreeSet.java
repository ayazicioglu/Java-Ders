package ders32_sets_maps;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_HashSet_TreeSet {
    public static void main(String[] args) {
        //bir hashSet ve bir treeSet oluşturun
        //bir loop ile içlerine rastgele 100000 sayı ekleyin
        //işlem sürelerini karşılaştırın

        Random rnd=new Random();
        int sayi;
        Set<Integer> hashSet=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();

       Long hashBaslangic=System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            sayi= rnd.nextInt(1000000);
            hashSet.add(sayi);
        }
        Long hashBitis=System.currentTimeMillis();
        Long treeBaslangic=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sayi= rnd.nextInt(1000000);
            treeSet.add(sayi);
        }
        Long treeBitis=System.currentTimeMillis();

        System.out.println("HashSet Süre: "+(hashBitis-hashBaslangic));
        System.out.println("TreeSet Süre: "+(treeBitis-treeBaslangic));

    }
}
