package ders11_forLoops;

import java.util.Scanner;

public class C01_ForLoop_ {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        for (int i=1; i<=10;i++){
            System.out.print((char)(karakter+i)+" ");

        }

    }
}
