package ders12_methodCreation;

public class C09_FibonacciSeri {
    public static void main(String[] args) {

        //verilen sayi adedince fibonacci serisinden sayilar yazdiran bir metot olusturun
        //Fibonacci serisi: 0 1 1 2 3 5 8 13 21 34 .....

        fibonaccidenSayiYazdir(6);
    }

    public static void fibonaccidenSayiYazdir(int adet) {
        //kullanıcının gıcıklık hakkını kullanacağını düşünelim
        //sayi 0 veya negatifse
        if (adet<=0){
            System.out.println("gecersiz giris");
        } else if (adet==1) {
            System.out.println("0");

        } else if (adet==2) {
            System.out.println("0 1");


        }else{
            int sayi1=0;
            int sayi2=1;
            System.out.print("0 1 ");
            for (int i = 3; i <=adet ; i++) {


            }
        }
    }
}
