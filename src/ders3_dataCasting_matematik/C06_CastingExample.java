package ders3_dataCasting_matematik;

import java.util.Scanner;

public class C06_CastingExample {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kesirli sayı girin:");
        double birinciSayi=scan.nextDouble();
        System.out.println("bir tam sayı girin");
        int ikinciSayi=scan.nextInt();
        System.out.println("değeriniz:"+(int)(birinciSayi/ikinciSayi));

    }
}
