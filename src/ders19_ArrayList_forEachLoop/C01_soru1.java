package ders19_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_soru1 {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari bir liste olarak bize donduren bir method olusturun.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen tam bölenleri bulunacak bir sayi giriniz: ");
        int girilenSayi= scan.nextInt();

        if (girilenSayi<=0){
            System.out.println("Geçersiz sayi");
        }else {
            List<Integer> tambolenlerListesi= pozitifBolenleriBul(girilenSayi);
            System.out.println(tambolenlerListesi);
        }
    }

    public static List<Integer> pozitifBolenleriBul(int girilenSayi){
        List<Integer> tambolenlerListesi=new ArrayList<>(); //buradaki tambolenlerListesi bu mahallenin çocugu
        for (int i = 1; i <=girilenSayi ; i++) {
            if (girilenSayi%i==0){
                tambolenlerListesi.add(i);
            }
        }
        return tambolenlerListesi;


    }



}
