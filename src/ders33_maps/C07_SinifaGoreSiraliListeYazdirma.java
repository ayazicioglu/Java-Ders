package ders33_maps;

import ders32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C07_SinifaGoreSiraliListeYazdirma {
    public static void main(String[] args) {
        //tum ogrenci listesini sinif sube isim soyisim no seklinde
        //doğal sıralı olarak yazdiran bir method oluşturun

    Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

    MapMethodDepo.sinifaGoreSiraliListeYazdir(ogrenciMap);

 }
}
