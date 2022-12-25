package ders2_dataturleri_scanner;

import java.util.Scanner;

public class C09_swap {
    public static void main(String[] args) {
        Scanner deger=new Scanner(System.in);
        System.out.println("Sırasıyla 1. ve 2. sayıyı giriniz");
        double birinciSayi= deger.nextDouble();
        double ikinciSayi= deger.nextDouble();
        double degisim;
        degisim=ikinciSayi;
        ikinciSayi=birinciSayi;
        birinciSayi=degisim;
        System.out.println("Yeni değerleriniz:\n"+birinciSayi+"\n"+ikinciSayi);
    }
}
