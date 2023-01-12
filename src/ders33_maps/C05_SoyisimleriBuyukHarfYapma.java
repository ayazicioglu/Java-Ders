package ders33_maps;

import ders32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimleriBuyukHarfYapma {
    public static void main(String[] args) {
        //map'teki soyisimleri buyuk harfe ceviren bir method olustruurn

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyisimleriBuyukHarfYapma(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);
    }
}
