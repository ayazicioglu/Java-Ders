package ders6_ifElseStatements;

import java.util.Scanner;

public class C02_IfElseStatementsUcgenSoru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Üçgenin uzunluklarını giriniz:");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();

        if ((kenar1==kenar2 && kenar1!=kenar3)||
                (kenar2==kenar3 && kenar1!=kenar3)||
                (kenar1==kenar3 && kenar2!=kenar3))

            System.out.println("ikizkenar üçgen");
        else System.out.println("İKizkenar Değil");
    }
}
