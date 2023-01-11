package ders02_dataturleri_scanner;

import java.util.Scanner;

public class C05_scanner_obje {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ismini yaz bro");
        String girilenİsim=scan.nextLine();
        System.out.println(girilenİsim.toUpperCase());
    }
}
