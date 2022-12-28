package ders12_methodCreation;

public class C04_faktoriyel {
    public static void main(String[] args) {
        int input=6;
            if (input>0 && input<=15){
                faktoryelYazdir(input);

            }else System.out.println("Girilen sayi 15'den kucuk pozitif tamsayi olmali");


    }
    public static void faktoryelYazdir(int sayi){
        int faktoryelSonuc=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryelSonuc*=i; //her loop da gelen sayiyi onceki değerle carpacak

        }
        System.out.println("Girilen "+sayi+" icin faktoryel: "+faktoryelSonuc);
    }
}
