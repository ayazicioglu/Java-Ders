package ders11_forLoops;

import java.util.Scanner;

public class C05_forloopSorusu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir başlangıç değeri giriniz:");
        int baslangic = scan.nextInt();
        System.out.println("Bir bitiş değeri giriniz:");
        int bitis = scan.nextInt();

        if (bitis < baslangic) {
            System.out.println("Başlangıç değeri bitiş değerinden küçük olmalı");
        } else {
            int toplam = 0;
            for (int i = baslangic; i <= bitis; i++) {
                toplam+=i;
            }
            System.out.println("Girdiğiniz değerlerin toplamı:\t"+toplam);
        }
    }
}