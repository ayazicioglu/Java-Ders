package ders32_sets_maps;

import java.util.Map;

public class C08_SubeListesiOlusturma {
    public static void main(String[] args) {
        //Verilen sinif ve sube ismi ile sinif listesini yazdiran method olusturalım
        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.subeListesiOlusturma(ogrenciMap,"11","M");
    }
}
