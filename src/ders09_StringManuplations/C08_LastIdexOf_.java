package ders09_StringManuplations;

public class C08_LastIdexOf_ {
    public static void main(String[] args) {

        String str="Javayi iyi ogrenmek icin cok calismam lazim cok.";

        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));

       int coksayisi=str.indexOf("cok");
       int sonCokSayisi=str.lastIndexOf("cok");

        if (!str.contains("cok")) System.out.println("cok kelimesi yok");
        else if (coksayisi==sonCokSayisi) System.out.println("bir kere kullanilmis");
        else System.out.println("birden fazla kullanilmis");

        System.out.println(str.lastIndexOf("a,", 15));


    }
}
