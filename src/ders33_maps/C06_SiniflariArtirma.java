package ders33_maps;

import ders32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C06_SiniflariArtirma {
    public static void main(String[] args) {
        //öğrenci map'indeki tüm sınıf değerlerini 1 artırın

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

       ogrenciMap= MapMethodDepo.sinifGecirme(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);
    }
}
