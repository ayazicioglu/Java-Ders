package ders28_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_TryCatch {
    public static void main(String[] args) {
        //kullanıcıdan toplamak üzere sayilar alın
        //kullanıcının islemi bitirmesi için  Q'ya basmasini isteyin
        //Kullanıcı Q'ya bastiginda toplam kaç sayi girdiğini
        //ve bu sayiların toplamının kaç oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int sayiAdedi=0;
        int sayilarToplami=0;
        while (sayiAdedi<10000){
        try {

                System.out.println("toplamak için tamsayi girin \nBitirmek için Q'ya basın");
                girilenSayi=scan.nextInt();
                sayilarToplami+=girilenSayi;
                sayiAdedi++;

        } catch (InputMismatchException e) {
            String girilenDeger=scan.nextLine();
            if (girilenDeger.equalsIgnoreCase("q")){
                System.out.println("Girilen "+sayiAdedi+" sayının toplami "+sayilarToplami);
            break; //bunun hikmetini anlamak için bu break'ı sil çalıştır gör,gecersiz inputtan sonra da devam et
            }else System.out.println("geçersiz input");
        }
    }
}
}