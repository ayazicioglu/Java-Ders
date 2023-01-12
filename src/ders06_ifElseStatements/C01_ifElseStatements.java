package ders06_ifElseStatements;

import java.util.Scanner;

public class C01_ifElseStatements
 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Üçgeniz uzunlukarını giriniz:");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        if (kenar1==kenar2&&kenar2==kenar3&&kenar1>0) System.out.println("eşkenar üçgen");
        else System.out.println("Eşkenar Değil");
    }
}
