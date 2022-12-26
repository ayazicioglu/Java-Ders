package ders4_increment;

public class C01_pre_post_incremeny {
    public static void main(String[] args) {

        int sayi=20;
        sayi=sayi+3;
        sayi +=3;
        sayi++;
        sayi++;
        sayi++;
        System.out.println(++sayi);

        sayi=sayi-2;
        sayi-=2;

        sayi=10;
        sayi--;
        System.out.println(sayi);

        sayi=10;
        System.out.println(sayi++);

        sayi=10;
        System.out.println(++sayi);

    }
}
