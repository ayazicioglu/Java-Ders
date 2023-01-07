package ders28_exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
        //Kullanicidan iki tamsayi alıp sayıları birbirine bölüp,sonucu yazdirin
        /*
        Try-catch bloklarının amacı riski 0 yapmak değil kodu iyi analiz yapip
        java'nın çözemeyeceği durumlarda ne yapmasını istediğimizi kendisine söylemektir.

        Java-try blogunda basedemmeyeceği bir sorunla karşılaşırsa siz o sorunu deklare edinceye kadar
        yani catch satırına kadar çalışmayı durdurur
        Bu durumda sorun olan satırla catch satırı arasındaki kodlar çalışmaz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("birbirine bölmek için iki tamsayı giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        try {
            System.out.println("İki sayının bölümü: "+sayi1/sayi2);

            System.out.println("kont1");
            System.out.println("kont2");
            System.out.println("kont3");
        } catch (ArithmeticException e) {
            System.out.println("bolen sayi sifir olamaz");
            System.out.println(e.getCause());
            e.printStackTrace(); //bu kod hatalar zincirini konsolda kırmızı yazdırmaya yarıyor
        }
    }
}
