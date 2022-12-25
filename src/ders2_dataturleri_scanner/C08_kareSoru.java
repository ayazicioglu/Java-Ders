package ders2_dataturleri_scanner;

import java.util.Scanner;

public class C08_kareSoru {
    public static void main(String[] args) {

        System.out.println("Dikdörtgenin iki kenar uzunluğunu giriniz:");
        Scanner al=new Scanner(System.in);
        double birinciKenar= al.nextDouble();
        double ikinciKenar= al.nextDouble();
        System.out.println("Dikdörtgenin alanı: "+birinciKenar*ikinciKenar);



    }
}
