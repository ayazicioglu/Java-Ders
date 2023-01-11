package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C07_scanner_ob {
    public static void main(String[] args) {
        System.out.println("isim giriniz");
        Scanner scan=new Scanner(System.in);
        String girilenİsim= scan.nextLine();
        System.out.println("soyisim girin");
        String girilenSoy=scan.nextLine();
        System.out.println("tevellüdü gir");
        int tevellüd=scan.nextInt();
        System.out.println("İsminiz: "+girilenİsim+"\nsoyisminiz: "+girilenSoy+"\nyaşınız: " +tevellüd+"\n Kaydınız tamamlanmıştır");
    }
}
