package ders10_StringMan_nul;

import java.util.Scanner;

public class C09_forloop_ {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Başlangıç");
        int baslangic= scan.nextInt();
        System.out.println("bitiş");
        int bitis= scan.nextInt();

        for (int i = baslangic; i <=bitis; i++) {
            if (i%5==0){
                System.out.print(" "+i);
            }
        }
    }
}
