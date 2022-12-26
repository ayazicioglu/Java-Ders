package ders8_StringManup;

import java.util.Random;

public class C06_lengthM {
    public static void main(String[] args) {
        String str="Java her gecen gun daha da guzellesiyor";
        //str.length yazmamız kelimenin tamamının uzunluğunu alır.
        //sondan 3. karakter için yazım şu şekilde olur

        System.out.println(str.charAt(str.length()-3));
        System.out.println(str.length());

        //rastgele bir karakteri yazdır,mesela:

        Random rnd=new Random();// rnd degeri icin 0 ile 1 arasinda rastgele bir deger olusturur
        int index= rnd.nextInt(str.length());// str.length()'den kucuk rastgele bir int uretir
        System.out.println(str.charAt(index));
    }
}
