package ders35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_PrintfCarpimTablosu {
    public static void main(String[] args) {
        //kullanıcıdan bir rakam alin ve carpim tablosu olusturun

        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        while (girilenSayi<=1||girilenSayi>=10) {
            try {
                System.out.println("Carpim tablosu oluşturmak için bir rakam giriniz");
                girilenSayi=scan.nextInt();
                if (girilenSayi>1&&girilenSayi<10){
                    break;
                }
                System.out.println("çarpım tablosu için 1 den büyük pozitif bir rakam girmelisiniz");
            } catch (InputMismatchException e) {
                System.out.println("çarpım tablosu için 1 den büyük pozitif bir rakam girmelisiniz");
                scan.next();
            }

        }
        for (int i = 1; i <=girilenSayi ; i++) {
            for (int j = 1; j <=girilenSayi ; j++) {
                int carpim=i*j;
                System.out.printf("%-3d  ",carpim);
            }
            System.out.println("");
        }
    }
}
