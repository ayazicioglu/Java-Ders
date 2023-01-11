package ders32_sets_maps;

import java.util.Map;

public class C06_Value {
    public static void main(String[] args) {

        //mapOlustur method'u bir map donduruyor
        // biz o class'taki map'i kullanmak istiyoruz ama her seferinde
        // onu class'tan kopyala yapıştır yapmak istemiyoruz

        // Bu class'ta bir map oluşturmak istediğimizde;
        //new HashMap<>() yaziyorduk normalde. Ama bu bize boş bir map getirir
        //bu kodun yerine sağ tarafa MapMethodDepo.ogrenciMapOlustur(); methodu ile çağırırsk
        //atamayı direk ona yapmış oluruz
        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Cemal-Han-12-M-MF");

        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 110=Cemal-Han-12-M-MF}

        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105, 106, 110]

        System.out.println(ogrenciMap.values());
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Cemal-Han-12-M-MF]

        //verilen ismin ogrenciMap'te olup olmadigini kontrol edip true veya false dönen bir method oluşturalım
        boolean sonuc=MapMethodDepo.isimIleOgrenciAra(ogrenciMap,"Ali");
        System.out.println(sonuc);//true

        System.out.println(MapMethodDepo.isimIleOgrenciAra(ogrenciMap, "Kemal"));//false
        System.out.println(MapMethodDepo.isimIleOgrenciAra(ogrenciMap, "Cem"));//false
    }
}
