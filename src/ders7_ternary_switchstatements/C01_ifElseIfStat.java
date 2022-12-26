package ders7_ternary_switchstatements;

import java.util.Scanner;

public class C01_ifElseIfStat {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int sayi=scan.nextInt();
        if (0<=sayi && sayi<=9) System.out.println("girilen sayi RAKAM");
        else if (10<=sayi && sayi<=99) System.out.println("girilen sayi İKİ BASAMAKLI");
        else if (sayi>99) System.out.println("girilen sayi BUYUK SAYI");


    }
}
