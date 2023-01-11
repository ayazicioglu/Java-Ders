package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C10_doubleVeInt {
    public static void main(String[] args) {
        Scanner al=new Scanner(System.in);
        System.out.println("Birincisi ondalıklı iki sayı gir");
        double birinciSayi= al.nextDouble();
        int ikinciSayi= al.nextInt();
        System.out.println("Sayılarınızın çarpımı:"+birinciSayi*ikinciSayi);
        System.out.println("Sayılarınızın toplamı:"+(birinciSayi+ikinciSayi));
    }
}
