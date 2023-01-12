package ders05_ifstatements;

import java.util.Scanner;

public class C04_ifstatementExample {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%3==0){
            System.out.println("sayi 3 ile tam bölünür");
        }
        if (sayi%5==0) System.out.println("sayi 5 ile tam bölünür");





    }
}
