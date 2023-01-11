package ders03_dataCasting_matematik;

public class C02_ExplicitNarrow {
    public static void main(String[] args) {
        double dbl=25.5;
        int sayi=(int)dbl;  //sen yine dök büyük kovayı küçüğe demiş oluyoruz. başına parantezde int yazarak
        System.out.println(sayi);

        byte byt=(byte)sayi;
        System.out.println(byt);

        sayi=130;
        byt=(byte)sayi;

        System.out.println(byt);
        sayi=255;
        byt=(byte)sayi;

        System.out.println(byt);
    }
}
