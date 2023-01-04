package ders22_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {
        // verilen bir List'de degisiklik yapan 2 method olusturun
        // 1.method list'in elementlerine yeni deger atayip yazdirsin
        // 2.method, list'e yeni bir list degeri atayip, yeni list'e
        //   elementler ekleyip yazdirsin
        // her iki method'u cagirdiktan sonra main method'daki list'i yazdiralim

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(34);
        sayilar.add(45);
        System.out.println(sayilar);//[10, 34, 45]
        elemanlariDegistir(sayilar);
        System.out.println("1. method call'dan sonra sayilar: "+sayilar);//1. method call'dan..[25, 54, 67]
        yeniListAta(sayilar);//YeniListAta metodunda syilar listinin son hali: [34, 98, 11]
        System.out.println("2.method call'dan sonra sayilar: "+sayilar);//[25, 54, 67]

        /*
        Java PassByValue kullanır;
        PassByValue: method'a gönderilen variable'in kendisini değil değerini göndermek demektir.
        primitive data türleri veya String gönderdiğimizde method da yapılan değişiklik method'da kalır.
        main method'da atama yapılmadıkça main method'daki varible'in değeri DEĞİŞMEZ.

        PassByValue çoklu element içeren array ve list gibi yapılar için de GEÇERLİDİR.
        Ancak çoklu elementi value olarak method'a gönderemediğinden array veya list'in adresini gönderir.
        Eğer method'da elementlere atama yapılırsa, main method'daki elementlerde değişmiş olur.
        Eğer list veya array'e yeni bir list veya array değeri atanırsa bu atama method'da kalır,
        main method'daki list veya array değişmez.

        Araba ayni kaldigi müddetçe içindekilerin değişmesi passByValue2'e aykiri değildir.
         */
    }
    public static void elemanlariDegistir(List<Integer> sayilar){
        sayilar.set(0,25);
        sayilar.set(1,54);
        sayilar.set(2,67);
        System.out.println("Elemanlari degistir metodunda list: " +sayilar);
    }
    public static void yeniListAta(List<Integer> sayilar){
        sayilar=new ArrayList<>();
        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);
        System.out.println("YeniListAta metodunda syilar listinin son hali: " +sayilar);
    }

}
