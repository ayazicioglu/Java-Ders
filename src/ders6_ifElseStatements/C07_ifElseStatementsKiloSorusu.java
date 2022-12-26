package ders6_ifElseStatements;

import java.util.Scanner;

public class C07_ifElseStatementsKiloSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kilonuzu kg olarak giriniz:");
        float kilo=scan.nextFloat();
        System.out.println("Boyunuzu cm olarak giriniz");
        int boy=scan.nextInt();
        float vki=((kilo*10000)/(boy*boy));
        System.out.println("Vücut kitle indeksiniz:\t"+vki);
        if (vki>=30) System.out.println("OBEZ");

        else if (vki>=25) {System.out.println("KİLOLU");

        } else if (vki>=20) {System.out.println("NORMAL");

        }else System.out.println("ZAYIF");
    }
}
