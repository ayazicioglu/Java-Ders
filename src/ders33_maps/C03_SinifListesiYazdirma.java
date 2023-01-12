package ders33_maps;

import ders32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_SinifListesiYazdirma {
    public static void main(String[] args) {
        //verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini bir liste olarak yazdiran bir method olstralm
        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"12");
    }
}
