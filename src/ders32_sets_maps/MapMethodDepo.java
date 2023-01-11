package ders32_sets_maps;

import java.util.*;

public class MapMethodDepo {
    //bize ogrenciMap donduren bir method olusturun

    public static Map<Integer, String> ogrenciMapOlustur() {
        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;
    }

    public static boolean isimIleOgrenciAra(Map<Integer, String> ogrenciMap, String isim) {
        //1-tüm value'leri bir collection olarak kaydedelim
        Collection<String> valuesCollection = ogrenciMap.values();

        //2-for-each kullanarak her bir value ele alalım
        for (String eachValue : valuesCollection
        ) {
            //3- -'lerden split yaparak parçalarız [Ali, Can, 11, H, MF] yapı buna döner
            String[] valueArr = eachValue.split("-");
            //4- split yaptığımız array'den isim bilgisini alalaım. yani 0. index
            String valuedekiIsim = valueArr[0];
            //5- eğer value'den aldıgımız isim, aranan isim ile aynı ise true dönüp for-each bitiririz
            if (valuedekiIsim.equalsIgnoreCase(isim)) {
                return true;
            }
        }
        //6-eğer for-each bittiğinde true olmadıysa false döndürelim
        return false;

    }

    public static void soyisimIleOgrenciListesiYazdirma(Map<Integer, String> ogrenciMap, String soyisim) {
        //1-soyisimleri kontrol etmek istiyorsak value'lere ulaşmalıyız. Bunun için value'leri
        //  collection olarak kaydederiz.
        Collection<String> ogrenciValueCollection = ogrenciMap.values();

        //listenin ilk satırı olarak başlıkları yazdıralım:
        System.out.println("İsim Soyisim Sinif Sube");

        //2-her bir value'yi for-each ile ele alırız.
        for (String eachValue : ogrenciValueCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valueSoyisim = valueArr[1];
            if (valueSoyisim.equalsIgnoreCase(soyisim)) {
                System.out.println(valueArr[0] + " " + valueArr[1] + " " + valueArr[2] + " " + valueArr[3]);
            }
        }
        //3-value'yi -'lerden split yapıp bir array elde ederiz.
        //4-array'in 1.indeksindeki soyisme bakıp aranan soyisim ile aynı ise
        //isim, soyisim, sinif ve sube bilgilerini yazdırırız
    }

    public static void subeListesiOlusturma(Map<Integer, String> ogrenciMap, String sinif, String sube) {
        Collection<String> ValueCollection = ogrenciMap.values();
        System.out.println("İsim Soyisim");

        for (String eachValue : ValueCollection
        ) {
            String[] valueArr = eachValue.split("-");//3-value'yi -'lerden split yapıp bir array elde ederiz.
            if (valueArr[2].equalsIgnoreCase(sinif) && (valueArr[3].equalsIgnoreCase(sube))) {
                System.out.println(valueArr[0] + " " + valueArr[1]); //4-array'in 1.indeksindeki soyisme bakıp aranan soyisim ile aynı ise
                //isim, soyisim, sinif ve sube bilgilerini yazdırırız
            }
        }


    }

    public static Map<Integer, String> numaraileSubeDegistirme(Map<Integer, String> ogrenciMap, int numara, String sube) {
        //1-okul numrasını bildigimiz için direkt ögenci value'ye ulaşabiliriz

        String ogrenciValue = ogrenciMap.get(numara);  // 104nolu ögreenci icin Ayse-Can-10-H-MF
        String[] valueArr = ogrenciValue.split("-");// [Ayse, Can, 10, H, MF]
        //2- sube ismini guncelleyelimm
        valueArr[3] = sube;// [Ayse, Can, 10, M, MF]
        //3-arraydeki guncel bilgileri yeniden value formatında bir String yaparız
        String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" + valueArr[3] + "-" + valueArr[4];

        //4-ogrenci no yani key ile yeni value'yi map'e ekleyelim
        ogrenciMap.put(numara, yeniValue);

        return ogrenciMap;

    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {
        //verilen siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        System.out.println("No isim soyisim bolum");
        System.out.println("=====================");

        for (Map.Entry<Integer, String> eachEntrySet : ogrenciMap.entrySet()) {

            //1-önce entryden value yu alalaım
            String entryValue = eachEntrySet.getValue();//Ali-Can-11-H-MF haline geldi

            //2-bu value'yi parçalayıp array'e store edelim
            String[] valueArr = entryValue.split("-");// [Ali, Can, 11, H, MF] haline geldi

            //3-sinif bilgisini kontrol edip, istenen sinif ile ayni ise bilgileri yazdir
            if (valueArr[2].equalsIgnoreCase(sinif)) {
                System.out.println(eachEntrySet.getKey() + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[4]);
            }
        }


    }

    public static void bolumListesiYazdirma(Map<Integer, String> ogrenciMap, String bolum) {
        System.out.println("No isim soyisim sinif");
        System.out.println("=====================");
        for (Map.Entry<Integer, String> eachEntrySet : ogrenciMap.entrySet()) {

            //1-önce entryden value yu alalaım
            String entryValue = eachEntrySet.getValue();

            //2-bu value'yi parçalayıp array'e store edelim
            String[] valueArr = entryValue.split("-");

            //3-bolum bilgisini kontrol edip, istenen bolum ile ayni ise bilgileri yazdir
            if (valueArr[4].equalsIgnoreCase(bolum)) {
                System.out.println(eachEntrySet.getKey() + " " + valueArr[0] + " " + valueArr[1] + " " + valueArr[2]);
            }
        }

    }

    public static Map<Integer, String> soyisimleriBuyukHarfYapma(Map<Integer, String> ogrenciMap) {
        for (Map.Entry<Integer, String> eachEntrySet : ogrenciMap.entrySet()) {

            //1-önce entryden value yu alalaım
            String entryValue = eachEntrySet.getValue();

            //2-bu value'yi parçalayıp array'e store edelim
            String[] valueArr = entryValue.split("-");

            //3-istenen soyisimi buyuk harf yapalım
            valueArr[1] = valueArr[1].toUpperCase();

            //şimdi yukarı doğru toplamaya başlıyoruz.
            //4-setValue() kullanarak value'yu yeni haline update edelim
            eachEntrySet.setValue(valueArr[0] + "-" +
                    valueArr[1] + "-" +
                    valueArr[2] + "-" +
                    valueArr[3] + "-" +
                    valueArr[4] + "-");


        }
        return ogrenciMap;

    }

    public static void tumListeYazdir(Map<Integer, String> ogrenciMap) {
        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap.entrySet();
        System.out.println("No   Ogrenci Bilgileri");
        System.out.println("======================");

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySet
        ) {
            System.out.println(eachEntry);
        }


    }

    public static Map<Integer,String> sinifGecirme(Map<Integer, String> ogrenciMap) {
        //map'de istedigimiz degisikligi yaptiktan sonra
        //map'i update etmenin en kolay yolu setEntry()

        for (Map.Entry<Integer, String> eachEntrySet : ogrenciMap.entrySet()) { //101=Ali-Can-11-H-MF

            String entryValue=eachEntrySet.getValue();// Ali-Can-11-H-MF

            String[] valueArr=entryValue.split("-"); //[Ali, Can, 11, H, MF]

           int sinifInt=Integer.parseInt(valueArr[2]);
           if (sinifInt==12){
               valueArr[2]="Mezun";
           }else {
               valueArr[2]=sinifInt+1+"";
           }

            eachEntrySet.setValue(valueArr[0] + "-" +
                    valueArr[1] + "-" +
                    valueArr[2] + "-" +
                    valueArr[3] + "-" +
                    valueArr[4] + "-");

        }


        return ogrenciMap;
    }

    public static void sinifaGoreSiraliListeYazdir(Map<Integer, String> ogrenciMap) {

        Set<String> siraliOgrenciSeti=new TreeSet<>();
        for (Map.Entry<Integer, String> eachEntrySet : ogrenciMap.entrySet()) {

            String entryValue=eachEntrySet.getValue();

            String[] valueArr=entryValue.split("-");

            String istanenFormattakiBilgi=valueArr[2]+" "+
                                            valueArr[3]+" "+
                                            valueArr[0]+" "+
                                            valueArr[1]+" "+
                                        eachEntrySet.getKey();

            siraliOgrenciSeti.add(istanenFormattakiBilgi);//natural order yapan treeSet'e yolluyoruz
        }
        System.out.println("Sinif Sube Isim Soyisim No");
        System.out.println("==========================");
        for (String each:siraliOgrenciSeti
             ) {
            System.out.println(each);
        }

    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {
        Set<String> siraliOgrenciSeti=new TreeSet<>();
        for (Map.Entry<Integer, String> eachEntrySet : ogrenciMap.entrySet()) {

            String entryValue=eachEntrySet.getValue();

            String[] valueArr=entryValue.split("-");

            String istanenFormattakiBilgi=valueArr[0]+" "+
                    valueArr[1]+" "+
                    eachEntrySet.getKey()+" "+
                    valueArr[2]+" "+
                    valueArr[3]+" "+
                    valueArr[4];

            siraliOgrenciSeti.add(istanenFormattakiBilgi);//natural order yapan treeSet'e yolluyoruz
        }
        System.out.println("Isim Soyisim No Sinif Sube Bolum");
        System.out.println("================================");
        for (String each:siraliOgrenciSeti
        ) {
            System.out.println(each);
        }


    }
}