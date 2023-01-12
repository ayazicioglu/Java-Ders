package ders06_ifElseStatements;

import java.util.Scanner;

public class C03_ifElseStatementsHarfsoru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz:");
        char karakter=scan.next().charAt(0);
        if (karakter>='a' && karakter<='z')System.out.println(Character.toUpperCase(karakter));
        else System.out.println(karakter);;

    }
}
