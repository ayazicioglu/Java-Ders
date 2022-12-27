package ders10_StringMan_nul;

public class C01_NullPointer_ {
    public static void main(String[] args) {
        String str1="";
        String str2="    ";
        String str3;
        String str4=null;

        System.out.println(str1.length());//0
        System.out.println(str2.length());//4

        System.out.println(str1.isEmpty());//true
        System.out.println(str2.isEmpty());//false

        System.out.println(str1.isBlank());//true
        System.out.println(str2.isBlank());//true

        //null bir değer değil işaretçidir (null pointer)
        //null pointer: non primitive bir objenin olusturulduğunu
        //ancak bilinçli olarak değer atanmadığnı işarretler
        //bunun meali str4 "null olarak işaretlenmiştir" denilir.

        //System.out.println(str3.length()); değer atamadığınız bir stringin uzunluğu olmaz
        //System.out.println(str3.concat("Ali Can")); değer atamadığın bir string birleştiremez
        //System.out.println(str3.substring(3, 4)); değer atamadığın stringin substringini alamaz

        //System.out.println(str4.length()); .NullPointerException hatası verir
        //System.out.println(str4.substring(3, 4));NullPointerException hatası verir

        System.out.println(str4);
        System.out.println(str4+"Ali Can"); //nullAli Can
        //System.out.println(str4.concat("Ali Can")); NullPointerException hatası verir

    }
}
