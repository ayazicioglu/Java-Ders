package ders32_sets_maps;

import java.util.Map;

public class C07_SoyisimileOgrenciArama {
    //ogrenci map'de aradığımız soyisim'deki ogrencilerin
    // isim, soyisim, sınıf ve sube'lerini  bir tablo olarak yazdıran bir method olusturun
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyisimIleOgrenciListesiYazdirma(ogrenciMap,"Cem");

    }

}
