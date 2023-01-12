package ders06_ifElseStatements;

import java.util.Scanner;

public class C09_NestedIfElseYasSorusu {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi Giriniz\nK : Kadin, E : Erkek ");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("Lutfen tam sayi olarak yasinizi giriniz");
        int yas = scan.nextInt();

        if (cinsiyet == 'K' || cinsiyet == 'k') {
            if (yas < 18 || yas > 88) System.out.println("gecersiz yas");
            else if (yas >= 60) System.out.println("emekli olabilirsin");
            else System.out.println("emekli olmak için\t" + (60 - yas) + "yıl calısmalısın");
        } else if (cinsiyet == 'E' || cinsiyet == 'e') {
            if (yas < 18 || yas > 88) System.out.println("gecersiz yas");
            else if (yas >= 65) System.out.println("emekli olabilirsin");
            else System.out.println("emekli olmak için\t" + (65 - yas) + "yıl calısmalısın");
        } else System.out.println("cinsiyet bilgisi hatalı");
    }
        }

