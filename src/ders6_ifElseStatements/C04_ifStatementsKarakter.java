package ders6_ifElseStatements;

import java.util.Scanner;

public class C04_ifStatementsKarakter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir karakter giriniz:");
        char karakter=scan.next().charAt(0);

        if (karakter>'@' && karakter<'[') System.out.println("girdiğiniz karakter büyük harftir");
        else System.out.println("girdiğiniz karakter büyük harf değildir");

    }
}
