package ders34_maps_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMap {
    public static void main(String[] args) {
        /*
        Aşağıdaki body'i map olarak oluşturalım
        {
                "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
                              "checkin" : "2021-06-01",
                              "checkout" : "2021-06-10"
                         },
                "additionalneeds" : "wi-fi" }
         */

        Map<String, Map<String,String>> otelMap = new HashMap<>();

        Map<String,String> bookingdatesMap=new HashMap<>();
        bookingdatesMap.put("checkin" , "2021-06-01");
        bookingdatesMap.put("checkout" , "2021-06-10");

        Map<String,Object> bookingMap=new HashMap<>(); //Map data türünü String,Object seçmeliyiz. Çünkü
                                                        //
        bookingMap.put("firstname" , "Ahmet");
        bookingMap.put("lastname" , "Bulut");
        bookingMap.put("totalprice" , 500);
        bookingMap.put("depositpaid" , false);
        bookingMap.put("bookingdates",bookingdatesMap);
        bookingMap.put("additionalneeds" , "wi-fi");

        System.out.println(bookingMap);
/*
        {firstname=Ahmet,
         additionalneeds=wi-fi,
            bookingdates={checkin=2021-06-01, checkout=2021-06-10},
            totalprice=500,
            depositpaid=false,
            lastname=Bulut}
 */

        //isim bilgisini yazdiralim
        System.out.println(bookingMap.get("firstname"));//Ahmet

        //additionelneeds yazdiralim
        System.out.println(bookingMap.get("additionalneeds"));//wi-fi

        //check-in bilgisini yazdiralim
        //bookingMap'deki value data türünü Object seçmiştik
        //dolayısıyla bookingdates key'ine ait value'yi Object olarak bize getirir
        //ama biz onun map olduğunu biliyoruz, CASTING YAPABILIRIZ!!!!
        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkin"));//2021-06-01

        //check-out tarihini yazdiralım
        System.out.println(((Map<?, ?>) bookingMap.get("bookingdates")).get("checkout"));//2021-06-10


    }
}
