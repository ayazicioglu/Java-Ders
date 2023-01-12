package ders5_ifstatements;

import java.util.Scanner;

public class C05_example {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char chr1=scan.next().charAt(0);

        if (chr1=='o'||chr1=='O') System.out.println("Ocak");
        if (chr1=='ş'||chr1=='Ş') System.out.println("Şubat");
        if (chr1=='m'||chr1=='M') System.out.println("Mart veya Mayıs");
        if (chr1=='h'||chr1=='H') System.out.println("Haziran");
        if (chr1=='t'||chr1=='T') System.out.println("Temmuz");
        if (chr1=='a'||chr1=='A') System.out.println("Ağustos veya Aralık");
        if (chr1=='e'||chr1=='E') System.out.println("Eylül veya Ekim");
        if (chr1=='k'||chr1=='K') System.out.println("Kasım");
        if (chr1=='n'||chr1=='N') System.out.println("Ocak");

    }
}
