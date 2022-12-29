package ders13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoops {
    public static void main(String[] args) {
        //Kullanicidan toplamak üzere sayı alın
        //Girilen sayilar toplami 500 olur veya gecerse
        //"Bu kadar sayi yeter" deyip toplami yazdıralım


        //bu soruyu illa da for loop ile yapalım derssek
        //adım sayısnı biraz abartabiliriz

        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayi = 0;
        for (int i = 1; i < 10000; i++) {


            System.out.println("Toplamak üzere TamSayı Giriniz: ");
            sayi = scan.nextInt();
            toplam += sayi;
            if (toplam >= 500) {
                System.out.println("Bu kadar sayi yeter. Toplamlari " + toplam + " oldu");
                break;
            }

        }
        toplam = 0;
        sayi = 0;
        while (toplam < 500) {

            System.out.println("Toplamak üzere TamSayı Giriniz: ");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println("Bu kadar sayi yeter. Toplamlari " + toplam + " oldu");
    }


}