package ders23_dateTime_varargs;

import java.time.LocalDate;
import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime zaman= LocalTime.now();
        System.out.println(zaman);//12:09:05.770556400

        System.out.println(zaman.getMinute());//9
        System.out.println(zaman.withSecond(0).withNano(0));//12:09
        System.out.println(zaman.withSecond(1).withNano(1));//12:09:01.000000001
        System.out.println(zaman.plusHours(100).plusMinutes(250));//20:20:37.861175200
        //bir for loop ile 1'den 10000'e kadar olan sayilari yanyana yazdirin
        //bu islem icin gecen zamani bulun
        LocalTime basZamani=LocalTime.now();
        System.out.println("baslangic: " +basZamani);
        for (int i = 1; i <=10000 ; i++) {
            System.out.print(i+" ");
        }
        LocalTime bitZamani=LocalTime.now();
        System.out.println("");
        System.out.println("bitis: " +bitZamani);

        System.out.println("Islem suresi: "+(bitZamani.getNano()-basZamani.getNano())+" nanosaniye");

        /*
        Oluşturduğumuz time veya date güncel zamani veya tarihi tutmaya devam eden bir sayaç değil,
        oluşturduğumuz satirdaki zamani veya tarihi sitemden alıp kaydeden bir variable'dır.

        İlerleyen satırlarda güncel zaman veya tarihe ihtiyacımız olduğunda yeni bir time veya date
        objesi oluşturp o andaki değeri alabiliriz
         */
    }
}
