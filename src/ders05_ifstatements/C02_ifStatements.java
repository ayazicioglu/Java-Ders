package ders5_ifstatements;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        double not=scan.nextDouble();
        if (not>0){
            System.out.println("sayi pozitif");
        }
        if (100 < not && not<999){
            System.out.println("sayınız 3 basamaklı");
        }
        if (not%3==0){
            System.out.println("sayı 3e tam bölünür");
    }
        if (not%10==7 ||not%10==-7){
            System.out.println("mükemmel");
}
        }
    }