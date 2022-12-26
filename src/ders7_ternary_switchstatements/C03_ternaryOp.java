package ders7_ternary_switchstatements;

public class C03_ternaryOp {
    public static void main(String[] args) {
        int input=33;

        if (input%2==0) System.out.println("çift sayı");
        else System.out.println("tek sayı");

            //ternary ile tek satırda aynı işlemi yapabiliriz:
        System.out.println(input%2==0 ? "çift sayi" : "tek sayi");
    }
}
