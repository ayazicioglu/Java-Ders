package ders08_StringManup;

import java.util.Scanner;

public class C01_StringManuplations {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");
        String girilenGun= scan.next();

        String kullanilangun=girilenGun.toLowerCase();//bunu Uppercase ile de yapabilliriz o zaman
                                                        //case leri "PAZARTESI".. diye donusturmeliyiz

        switch (kullanilangun){
            case "pazartesi":
                System.out.println(girilenGun+"\tçalışma zamanıdır tatile 5 gün var");break;
            case "sali":
                System.out.println(girilenGun+"\tçalışma zamanıdır tatile 4 gün var");break;
            case "carsamba":
                System.out.println(girilenGun+"\tçalışma zamanıdır tatile 3 gün var");break;
            case "persembe":
                System.out.println(girilenGun+"\tçalışma zamanıdır tatile 2 gün var");break;
            case "cuma":
                System.out.println(girilenGun+"\tçalışma zamanıdır tatile 1 gün var");break;
            case "cumartesi":
                System.out.println(girilenGun+"\tşimdi tatil zamanı");break;
            case "pazar":
                System.out.println(girilenGun+"\tşimdi tatil zamanı");break;
            default:
                System.out.println("hatalı giris");
        }
    }
}
