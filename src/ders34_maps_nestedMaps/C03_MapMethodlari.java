package ders34_maps_nestedMaps;

import ders32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap.containsValue("Ali"));//false döndürür. oysaki Ali var
        // value değeriinin tamami sorulursa true döner ama bir parçasını sormuşuz o yüzden false

        //getOrDefault bir key gireriz bulurs getirir bulmazsa yazdığım default değeri yazar
        System.out.println(ogrenciMap.getOrDefault(103, "Ogrenci bulunamadi"));//Ali-Cem-11-K-TM
        System.out.println(ogrenciMap.getOrDefault(123, "Ogrenci bulunamadi"));//Ogrenci bulunamadi

        //replace methodu
        ogrenciMap.replace(103,"Ali-Cem-11-K-MF");
        //replace eğer yoksa error atabilir ama put yazarsak yoksa bile ekler
        System.out.println(ogrenciMap.get(103));//Ali-Cem-11-K-MF

        //put methodu
        ogrenciMap.put(103,"Ali-Cem-11-K-MF");
        System.out.println(ogrenciMap.get(103));//Ali-Cem-11-K-MF

        System.out.println(ogrenciMap.replace(123, "Ali-Cem-11-K-MF"));//null
        System.out.println(ogrenciMap);

        //replace2in bir başka kullanımı, key gir, eski value gir, yeni value gir. ilk ikisi tutuyosa üçüncüyü atar
        ogrenciMap.replace(103,"Ali-Cem-11-K-MF","Ali-Han-11-K-MF");
        System.out.println(ogrenciMap.get(103));//Ali-Han-11-K-MF
    }
}
