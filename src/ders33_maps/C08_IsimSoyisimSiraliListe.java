package ders33_maps;

import ders32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C08_IsimSoyisimSiraliListe {
    public static void main(String[] args) {
        //tum ogrenci listesini isim soyisim numara sinif sube bolum
        //seklinde sirali olarak yazdiran bir method olsuturalim

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.isimSoyisimSiraliListeYazdir(ogrenciMap);
    }
}
