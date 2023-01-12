package ders06_ifElseStatements;

import java.util.Scanner;

public class C10_NestedIndirimSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kaç ürün aldığınızı belirtin:");
        int urun=scan.nextInt();
        System.out.println("liste fiyatını belirtin:");
        double liste=scan.nextDouble();
        System.out.println("Müşteri kartınız var mı: E veya H");
        char kart=scan.next().charAt(0);

        if(kart=='E'||kart=='e')
            if(urun<=0) System.out.println("gecersiz urun adedi");
            else if(urun<10) System.out.println("yüzde15 idrimli fiyatınız:\t"+(urun*liste*85/100));
            else System.out.println("yüzde20 idrimli fiyatınız:\t"+(urun*liste*80/100));

        else if (kart=='H'||kart=='h')
            if(urun<=0) System.out.println("gecersiz urun adedi");
            else if(urun<10) System.out.println("yüzde10 idrimli fiyatınız:\t"+(urun*liste*90/100));
            else System.out.println("yüzde15 idrimli fiyatınız:\t"+(urun*liste*85/100));

        else System.out.println("kart bilgisi gecersiz");

    }
}
