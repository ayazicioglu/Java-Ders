package ders3_dataCasting_matematik;

import java.util.Scanner;

public class C08_sayininRakamlarToplamş {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("4 basamaklı bir sayı giriniz:");
        int sayi=scan.nextInt();


        int birler=0;
        int rakamlarToplami=0;

        birler=sayi%10;
        rakamlarToplami=rakamlarToplami+birler;
        sayi=sayi/10;

        birler=sayi%10;
        rakamlarToplami=rakamlarToplami+birler;
        sayi=sayi/10;

        birler=sayi%10;
        rakamlarToplami=rakamlarToplami+birler;
        sayi=sayi/10;

        birler=sayi%10;
        rakamlarToplami=rakamlarToplami+birler;
        sayi=sayi/10;

        System.out.println("rakamlar toplami:"+rakamlarToplami);
    }
}
