package ders12_methodCreation;

import java.util.Scanner;

public class C05_BasitHesapMakinesi {
    public static void main(String[] args) {
        //Kullanicidan 2 sayi ve istediği matematiksel işlemi (+-*/)alın
        //bir metot olusturup sayilara istenen islemi uygulayıp sonucu dondurun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen İki Sayı Giriniz");
        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("Lütfen yapmak istediğiniz matematiksel işlem seçin + - * / ");
        char islem=scan.next().charAt(0);
        System.out.println(hesapMakinesi(sayi1, sayi2, islem));


    }
    public static double hesapMakinesi(double sayi1, double sayi2, char islem){
        switch (islem){
            case '+':
                return sayi1+sayi2;
            case '-':
                return sayi1-sayi2;
            case '*':
                return sayi1*sayi2;
                case '/':
                    return sayi1/sayi2;
            default:return 0;
        }
    }
}
