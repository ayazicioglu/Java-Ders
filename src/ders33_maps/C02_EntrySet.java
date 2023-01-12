package ders33_maps;

import ders32_sets_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        //tum ogrencileri 101=Ali-Can-11-H-MF seklinde yazdirin

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        System.out.println("No    Öğrenci Bilgileri");
        System.out.println("=======================");

        //once ogrenci numaralarını elde edelim
        Set<Integer> ogrenciNoSet=ogrenciMap.keySet();//[101, 102, 103, 104, 105, 106]

        for (Integer eachKey:ogrenciNoSet
             ) {
            System.out.println(eachKey+"="+ogrenciMap.get(eachKey));

        }
        /*
        Aslında bizden istenen Map'in içindeki elementler
        Java map'deki elementleri key-value ikilisi olarak birlikte alabilmemiz için
        ENTRY interface'i olusturmuştur.

        entry'ler de map ile ayni data yapisina sahip olmalıdır
        ornegin ogrenci map'ini dusunursek entry'ler

        Entry<Integer,String>
         */

        Set<Map.Entry<Integer,String>> ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println("No    Öğrenci Bilgileri");
        System.out.println("=======================");
        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySet
             ) {
            System.out.println(eachEntry);
        }


    }
    }

