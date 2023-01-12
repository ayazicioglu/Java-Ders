package ders5_ifstatements;

import java.util.Scanner;

public class C01_ifStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("notunu gir");
        double not=scan.nextDouble();

        if (0 <=not && not<50) {
            System.out.println("notunuz dd kaldın ulen");
        }
        if (50<=not && not<65) {
            System.out.println("hadi idare eder geçtiniz notunuz: cc");
        }
        if (65<=not && not<85){
            System.out.println("notunuz bb tebriks");
        }
        if (85<=not && not<=100){
            System.out.println("oha helal aa notun");
        }
        if (not>=100){
            System.out.println("yok amk daha neler adam ol len");
        }
    }
}
