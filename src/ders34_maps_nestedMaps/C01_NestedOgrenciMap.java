package ders34_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedOgrenciMap {
    public static void main(String[] args) {

        Map<Integer, Map<String,String>> ogrenciMap = new HashMap<>();

        // ogrenciMap.put(101, "Ali-Can-11-H-MF"); artık buna gerek yok. çünkü aşağıda hepsini tek tek yaptık
        Map<String,String> ogrenci101=new HashMap<>();
        ogrenci101.put("İsim","Ali");
        ogrenci101.put("Soyisim","Can");
        ogrenci101.put("Sinif","11");
        ogrenci101.put("Sube","H");
        ogrenci101.put("Bolum","MF");

        //ogrenciMap.put(102, "Veli-Cem-10-K-TM");artık buna gerek yok. çünkü aşağıda hepsini tek tek yaptık

        Map<String,String> ogrenci102=new HashMap<>();
        ogrenci102.put("İsim","Veli");
        ogrenci102.put("Soyisim","Cem");
        ogrenci102.put("Sinif","10");
        ogrenci102.put("Sube","K");
        ogrenci102.put("Bolum","TM");

        //ogrenciMap.put(103, "Ali-Cem-11-K-TM");artık buna gerek yok. çünkü aşağıda hepsini tek tek yaptık

        Map<String,String> ogrenci103=new HashMap<>();
        ogrenci103.put("İsim","Ali");
        ogrenci103.put("Soyisim","Cem");
        ogrenci103.put("Sinif","11");
        ogrenci103.put("Sube","K");
        ogrenci103.put("Bolum","TM");

        ogrenciMap.put(101,ogrenci101);
        ogrenciMap.put(102,ogrenci102);
        ogrenciMap.put(103,ogrenci103);

        System.out.println(ogrenciMap); //tüm map'i yazdıralım
        /*
        {101={Bolum=MF, Soyisim=Can, Sube=H, Sinif=11, İsim=Ali},
         102={Bolum=TM, Soyisim=Cem, Sube=K, Sinif=10, İsim=Veli},
         103={Bolum=TM, Soyisim=Cem, Sube=K, Sinif=11, İsim=Ali}}

         */

       // 101 numaralı örencinin ismini yazdıralım
        System.out.println(ogrenciMap.get(101).get("İsim"));//Ali

        //102 numaralı öğrencinin sınıf bilgisini yazdıralım
        System.out.println(ogrenciMap.get(102).get("Sinif"));//10

        //103 numaralı öğrencinin sınıfını 12 yapalım
        Set<Map.Entry<Integer, Map<String, String>>> ogrenciEntrySet = ogrenciMap.entrySet();
        for (Map.Entry<Integer, Map<String, String>> eachOgrenciEntry:ogrenciEntrySet //şöyle bir bilgi getirecek:
            // 103={Bolum=TM, Soyisim=Cem, Sube=K, Sinif=11, İsim=Ali}}
                //önce öğrenci value'sini kaydetmeliyiz
        ) {
           if (eachOgrenciEntry.getKey()==103){
               Map<String,String> eachOgrenciValueMap =eachOgrenciEntry.getValue();
               //{Bolum=TM, Soyisim=Cem, Sube=K, Sinif=11, İsim=Ali}

               eachOgrenciValueMap.put("Sinif","12");//sinif değerini güncelledik

               eachOgrenciEntry.setValue(eachOgrenciValueMap);
           }
        }
        System.out.println(ogrenciMap);
    }
}
