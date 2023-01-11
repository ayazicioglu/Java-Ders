package ders31_collections;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set {
    public static void main(String[] args) {
        //Set indeks yapısını desteklemez, yani başı sonu yok önce ben geldim sonra sen felan bunlara bakmaz

        Set<String> ogrenciler=new TreeSet<>();
        ogrenciler.add("Esra");
        ogrenciler.add("Ayten");
        ogrenciler.add("Furkan");

        System.out.println(ogrenciler);//[Ayten, Esra, Furkan] naturalOrder doğal sıralı alfabetik sıraladı

        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler);//[Ahmet, Ayten, Esra, Furkan

        ogrenciler.add("Furkan");
        System.out.println(ogrenciler);//[Ahmet, Ayten, Esra, Furkan] eski Furkan'ı siler yeni Furkan ekler
    }
}
