package ders6_ifElseStatements;

import java.util.Scanner;

public class C08_ifElseIfIndirimSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kaç ürün aldığınızı belirtin:");
        int urun=scan.nextInt();
        System.out.println("liste fiyatını belirtin:");
        double liste=scan.nextDouble();
        System.out.println("Müşteri kartınız var mı: E veya H");
        char kart=scan.next().charAt(0);
        int indirim;
        if (kart=='E'&&urun>=10) System.out.println("%20 indirim alırsınız:\t"+urun*liste*80/100);

        else if (kart=='H'&& urun>=10) {System.out.println("%15 indirim alırsınız:\t"+urun*liste*85/100);


        } else if (kart=='E'&&urun>0) {
            System.out.println("%15 indirim alırsınız:\t"+urun*liste*85/100);


        } else if (kart=='H'&& urun>0) {
            System.out.println("%10 indirim alırsınız:\t"+urun*liste*90/100);

        }else System.out.println("Hatalı bilgi");


    }
}
