package ders32_sets_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {
    //bize ogrenciMap donduren bir method olusturun

    public static Map<Integer,String> ogrenciMapOlustur(){
        Map<Integer,String> ogrenciMap=new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static boolean isimIleOgrenciAra(Map<Integer, String> ogrenciMap, String isim) {
        //1-tüm value'leri bir collection olarak kaydedelim
        Collection<String> valuesCollection= ogrenciMap.values();

        //2-for-each kullanarak her bir value ele alalım
        for (String eachValue:valuesCollection
             ) {
            //3- -'lerden split yaparak parçalarız [Ali, Can, 11, H, MF] yapı buna döner
            String [] valueArr=eachValue.split("-");
            //4- split yaptığımız array'den isim bilgisini alalaım. yani 0. index
            String valuedekiIsim=valueArr[0];
            //5- eğer value'den aldıgımız isim, aranan isim ile aynı ise true dönüp for-each bitiririz
            if (valuedekiIsim.equalsIgnoreCase(isim)){
                return true;
            }
        }
        //6-eğer for-each bittiğinde true olmadıysa false döndürelim
        return false;

    }

    public static void soyisimIleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {
        //1-soyisimleri kontrol etmek istiyorsak value'lere ulaşmalıyız. Bunun için value'leri
        //  collection olarak kaydederiz.
        Collection<String> ogrenciValueCollection= ogrenciMap.values();

        //listenin ilk satırı olarak başlıkları yazdıralım:
        System.out.println("İsim Soyisim Sinif Sube");

        //2-her bir value'yi for-each ile ele alırız.
        for (String eachValue:ogrenciValueCollection
             ) {
            String[] valueArr=eachValue.split("-");
            String valueSoyisim=valueArr[1];
            if (valueSoyisim.equalsIgnoreCase(soyisim)){
                System.out.println(valueArr[0]+" "+valueArr[1]+" "+valueArr[2]+" "+valueArr[3]);
            }
        }
        //3-value'yi -'lerden split yapıp bir array elde ederiz.
        //4-array'in 1.indeksindeki soyisme bakıp aranan soyisim ile aynı ise
        //isim, soyisim, sinif ve sube bilgilerini yazdırırız
    }
}
