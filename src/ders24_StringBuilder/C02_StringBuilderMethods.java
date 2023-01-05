package ders24_StringBuilder;

public class C02_StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");
        System.out.println(sb.capacity());//16+4=20 yazdırır
        System.out.println(sb.length());//4 yazdırır

        //4 uzunluğun fazlasını atalım trimToSize kullanırız
        sb.trimToSize();
        //atama yapmadigimiz halde bu değişiklik kalıcı olur mu?
        // StringBuilder mutable oldugundan method'lara yapılan değişiklikler kalıcı olur
        System.out.println(sb.capacity());//4

        sb.toString().toUpperCase();
        System.out.println(sb);//Java
        //StringBuilder'ı Stringe çevirirsek yada String döndürecek method'lar kullanırsak
        //String'in immutable özelliği devreye girer ve yapılan değişikler kalıcı olmaz

        // sb=sb.toString().toUpperCase(); nonprimitive data türlerinde farklı data türünden atama yapamayız

        //Short sayi1=20;
        //Integer sayi2=sayi1; buradaki atamaları da yapamayız. nonprimitive pirimitive e dönüşmez

        //illa da dönüştürmek için çare arıyorsak al yeniden bir stringbuilder oluşturururz

        StringBuilder sb2=new StringBuilder(sb.toString().toUpperCase());
        System.out.println(sb2);//JAVA

        sb=sb2; //artık atama yapabiliriz
        System.out.println(sb);//JAVA

        sb.setCharAt(0,'H');
        System.out.println(sb);//HAVA

        System.out.println(sb.substring(2, 3));//V
        System.out.println(sb);//HAVA

        System.out.println(sb.reverse());//AVAH StringBuilder döndürdüğü için kalıcı oldu

        sb.insert(1,"H ");
        System.out.println(sb);// AH VAH

        String uzunMetin=" ETMEK YOK CALISMAK VAR";
        sb.insert(6,uzunMetin,0,10);
        System.out.println(sb);//AH VAH ETMEK YOK

        System.out.println(sb.indexOf("A", 3));//4 burada 3. karakteri bulur ondan sonraki A'nın indeksini yazar
        System.out.println(sb.indexOf("VAH"));//3 baştan aramaya başlayacak VAH in indeksi bulup yazacak
        System.out.println(sb.lastIndexOf("VAH"));//3 sondan aramaya başlayacak

        System.out.println(sb.lastIndexOf("E", 9));//7 9.indekse kadar gelir tersten E yi bulup indeksi yazdırır
        sb.replace(0,12,"Sorun");
        System.out.println(sb);//Sorun YOK

        sb.delete(5,sb.length());//YOK u silelim. Başlangıç indeks dahil, bitiş dahil değil, o yüzden length
        System.out.println(sb);//Sorun


    }
}
