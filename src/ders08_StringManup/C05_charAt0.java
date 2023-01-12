package ders08_StringManup;

public class C05_charAt0 {
    public static void main(String[] args) {
        String str="Java guzeldir"; // 13 tane karakter barindirir
        // java'da index 0'dan baslar
        // J==> 0.index, r==>12
        // charAt(index) ile istedigimiz index'deki char'a ulasabiliriz

        System.out.println(str.charAt(1)); // ilk a'yi yazdiralim
        System.out.println(str.charAt(13-2));// sondan 2.harfi yazdiralim
        System.out.println(str.toUpperCase().charAt(13-4)); // sondan 4.karakteri buyuk harf olarak yazdirin
        // charAt() method'u bize char döndürdügü icin toUppercase() calismaz
        // String method'larini charAt() ile kullanmak isterseniz
        // charAt()'den once kullanmalisiniz

        // System.out.println(str.charAt(18)); // StringIndexOutOfBoundsException
        // Eger index olarak karakter sayisi veya daha buyuk bir deger girersek
        // o index'i bulamayacagi icin hata verir System.out.println(str.charAt(13));


    }
}
