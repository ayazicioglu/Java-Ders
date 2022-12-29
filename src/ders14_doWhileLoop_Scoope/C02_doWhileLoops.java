package ders14_doWhileLoop_Scoope;

import java.util.Scanner;

public class C02_doWhileLoops {
    public static void main(String[] args) {
        //kullanıcıdan istediği kadar sayı alın ve toplayın
        //kullanıcı değer olarak 0 a basarsa islemi bitirin. Do while ile yapmak
        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int toplam=0;

        do {
            System.out.println("Lütfen toplanacak sayi giriniz: ");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;
        }while (girilenSayi!=0);
        System.out.println("Girdiğiniz değerlerin toplami: "+toplam);

        /*
        While loop'da ilk şart sağlanmazsa loop body hiç ÇALIŞMAZ
        Do-While Loop'da önce body çalıştığı için şart yanlış olsa bile loop body'si en az 1 kere çalışır
         */
    }
}
