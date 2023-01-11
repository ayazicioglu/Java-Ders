package ders32_sets_maps;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {
    public static void main(String[] args) {
        //Numarasi verilen ogrencinin ismini verilen sube yapan bir method yapalim
        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.numaraileSubeDegistirme(ogrenciMap,104,"M");//104 nolu ogrencinin subesi M olsun diyoruz
        System.out.println(ogrenciMap);

        ogrenciMap=MapMethodDepo.numaraileSubeDegistirme(ogrenciMap,101,"L");//101 nolu ogrencinin subesi L olsun diyoruz
        System.out.println(ogrenciMap);

    }
}
