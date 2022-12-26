package ders7_ternary_switchstatements;

public class C07_nestedTernary {
    public static void main(String[] args) {
        int sayi=23;
        System.out.println(sayi>0?"sayi pozitif": "sayi pozitif değil");

        System.out.println(sayi>0
                ?
                sayi%2==0 ? "cift sayi" : "tek sayi"
                :
                -100>=sayi && sayi>=-999 ? "3 basamakli" : "# basamakli degil"
        );

    }
}
