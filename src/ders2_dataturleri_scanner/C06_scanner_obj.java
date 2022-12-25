package ders2_dataturleri_scanner;

import java.util.Scanner;

public class C06_scanner_obj {

    public static void main(String[] args) {
        Scanner scann= new Scanner(System.in);
        System.out.println("pampa gir şu karesini almak istediğin sayıyı");
        double girilensayi= scann.nextDouble();
        System.out.println("girdiğin sayının karesi "+girilensayi*girilensayi+" dir");


    }
}
