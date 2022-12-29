package ders13_methodOverloading_whileLoop;

public class C03_MetodOverLoading {
    public static void main(String[] args) {
    toplama(5.4,6.3);
    toplama('a','b');
    toplama(8.4,6);

    }
    public static void toplama(int sayi2, double sayi1){
        System.out.println("int ve double sayıların toplami: "+(sayi1+sayi2));
    }

    public static void toplama(double sayi1, double sayi2){
        System.out.println("2 double sayinin toplami: "+(sayi1+sayi2));
    }
}
