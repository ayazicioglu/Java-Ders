package ders13_methodOverloading_whileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_whileBasitOyunn {
    public static void main(String[] args) {
        /*
        random olarak 1 ile 100 arasında bir sayı olusturun
        kullanicidan bu sayiyi bilmesini isteyin
        kullanici her deger girdiginde tuttudugumuz sayi ile karsilastirip buyut/kucut diyelim
        kullanici tuttugumuz sayiyi bildiginde tahmin sayısını ve

        -3 veya daha az tahminde bildiyse "Vaowww"
        -4-8 tahminde bildiyse "Aferin"
        daha fazla tahminde bildiyse "Basarisiz" yazdirin
         */
        Random rnd = new Random();
        int tutulanSayi = rnd.nextInt(100);
        int sayac=1;
        int tahmin=0;
        Scanner scan=new Scanner(System.in);
        while (tutulanSayi!=tahmin){
            System.out.println("Lütfen bir tahmin giriniz");
            tahmin=scan.nextInt();
            if (tutulanSayi==tahmin){
                System.out.println(sayac+" tahminde buldun");
                if (sayac<=3){
                    System.out.println("Vauww");
                } else if (sayac<=8) {
                    System.out.println("Aferin");
                }else System.out.println("Basarisiz");
                break;
            } else if (tahmin<tutulanSayi) {
                System.out.println("Sayiyi büyütün");
                sayac++;

            }else {
                System.out.println("Sayiyi küçült");
                sayac++;
            }
        }
    }
}