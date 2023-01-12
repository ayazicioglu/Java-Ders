package ders09_StringManuplations;

import java.util.Scanner;

public class C04_endsWithh {
    public static void main(String[] args) {
        String str="Java ogrenen issiz kalmaz";
        System.out.println(str.endsWith("kalmaz"));//true
        
        System.out.println(str.endsWith("Java ogrenen issiz kalmaz"));//true
        
        System.out.println(str.endsWith(""));//true

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mailinizi giriniz:");
        String adres=scan.nextLine();
        if (!adres.contains("@")) System.out.println("gecersiz mail");
        else if (!adres.contains("@gmail.com")) System.out.println("gmail olmalı");
        else if (!adres.endsWith("@gmail.com")) System.out.println("mailde yazım hatası var"); {

        }
        {
            
        }


    }
}
