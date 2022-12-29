package ders14_doWhileLoop_Scoope;

import java.util.Scanner;

public class C01_doWhileLoops {
    public static void main(String[] args) {
        //kullanıcıdan istediği kadar sayı alın ve toplayın
        //kullanıcı değer olarak 0 a basarsa islemi bitirin
        Scanner scan=new Scanner(System.in);
        int girilenSayi=1; //şart 0 olmadıkça aşağıdaki loop çalışacağı için bu değer 0 hariç herhangi
        int toplam=0;       //bir değer olabilir. ben 1 yazdım

        while (girilenSayi!=0){
            System.out.println("Lütfen toplamak için bir tam sayi giriniz");
            girilenSayi=scan.nextInt();
            toplam=toplam+girilenSayi;
        }
        System.out.println("Girdiğiniz değerlerin toplami: "+toplam);
        /*
        While loop'un 2 tane negatif tarafı vardır.
        1- loop dan önce oluşturduğumuz ve loop'ta kullanacağımız variable'a yanlış değer verirsek
        loop body çalşmaz

        Bu negatif yönler onu kullanilmaz yapacak büyüklükte değildir
        Ancak bu negatifliklerden kurtumak istersek do while
         */
    }
}
