package ders13_methodOverloading_whileLoop;

public class C04_whileLoops {
    public static void main(String[] args) {
        //2 basamaklı sayılardan 7 ile bölünebilenleri yazdıralım

        for (int i = 10; i <= 99; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");

            }
        }
        System.out.println("");
        int sayi = 10;
        while (sayi < 100) {
            if (sayi % 7 == 0) {
                System.out.print(sayi + " ");
            }
            sayi++;
        }
    }
}