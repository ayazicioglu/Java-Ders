package ders28_exceptions;

import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {
        //Kullanicidan iki tamsayi alıp sayıları birbirine bölüp,sonucu yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("birbirine bölmek için iki tamsayı giriniz");

        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();

        try {//try bolumu: yapmak istediğimiz ama exception riski oluşturan kodlar
            System.out.println("İki sayının bölümü: "+sayi1/sayi2);
        } catch (ArithmeticException e) {//catch() bolumu: bekledigimiz muhtemel exception ve
                                //bu exception gerçekleşirse hata dökümanını store edebileceğimiz variable
            System.out.println("bölünecek sayi 0 olamaz");
            e.printStackTrace();
            // throw new RuntimeException(e); //bu satırı silip sout: bölecek sayi sifir olamaz yazdırabiliriz
            //catch blogu: exception gerçekleşirse calışmasni istediğimiz kodlar
            //burayı yazarken öncelikle exception oluştuğunda kodlarin çalışması dursun mu yoksa devam mı etsin
            //kararını vermeliyiz
        }
    }
}
