package ders05_ifstatements;

import java.util.Scanner;

public class C06_ucgenSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını sırasıyla giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        if (kenar1==kenar2&&kenar2==kenar3 && kenar1>0) System.out.println("Eskenar ucgen");
    }
}
