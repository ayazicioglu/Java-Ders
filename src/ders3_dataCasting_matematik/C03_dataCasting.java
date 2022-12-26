package ders3_dataCasting_matematik;

import java.util.Scanner;

public class C03_dataCasting {
    public static void main(String[] args) {
        System.out.println(28/5);
        System.out.println(29/3);

        System.out.println("iki tam sayı giriniz");
        Scanner al=new Scanner(System.in);
        int ilkSayi= al.nextInt();
        int ikinciSayi= al.nextInt();

        System.out.println("ikisayının bölme sonucu:" +(double)ilkSayi/ikinciSayi);
        System.out.println("ikisayının bölme sonucu:" +ilkSayi/(double)ikinciSayi);
    }
}
