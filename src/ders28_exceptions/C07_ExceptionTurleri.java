package ders28_exceptions;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {
        String str="25";

        //str'a sayısal olarak beş ekleyin

        System.out.println(Integer.parseInt(str)+5);

        //eğer str içinde sayi olmayan bir karakter olursa NumberFormatException olur

        Object sayiObj= str; //String bir variable'ı Object bir değer olarak tanıtıyoruz
        Integer sayiInt=(Integer) sayiObj; // bu sefer  de object bir variable'ı Integer'a cast ediyoruz
        System.out.println(sayiInt); //ClassCastException verir. bu dolambaçı yemedi Java
    }
}
