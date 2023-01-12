package ders06_ifElseStatements;

import java.util.Scanner;

public class C06_ifElseIfYasSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas=scan.nextInt();
        System.out.println("lütfen cinsiyetinizi giriniz\n: Erkek için 'E' Kadın İçin 'K'");
        char cins=scan.next().charAt(0);


        if ((cins=='K'||cins=='k') && yas>=60) System.out.println("emekli olabilirsin");
        else if ((cins == 'K' || cins == 'k') && yas >= 18)
            System.out.println("Emekli olmak için\t" + (60 - yas) + "Yıl daha çalışman gerekir");
        else if ((cins=='E'||cins=='e') && yas>=65) {
            System.out.println("emekli olabilirsiniz");
            //else if ((cins == 'E' || cins == 'e') && yas >= 18)
                System.out.println("Emekli olmak için\t" + (60 - yas) + "Yıl daha çalışman gerekir");
            //else System.out.println("geçersiz bilgi");

        }

    }
}
