package ders33_maps;

import ders32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C04_BolumListesiYazdirma {
    public static void main(String[] args) {
        //verilen bolumdeki ogrencilerin No,İsim,Soyisim,ve Sınıflarını yazdıran bir method olstrılm

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.bolumListesiYazdirma(ogrenciMap,"MF");
    }
}
