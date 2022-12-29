package ders13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_whileSıfreKontrolEt {
    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        //sifre kontrolunu bir method'da yapip true/false dondurun
        //sonucu kontrol edip "basari ile olusturuldu" yazincaya kadar sifreyi tekrar tekrar isteyin

        Scanner scan=new Scanner(System.in);
        boolean tekrarSifreIste=true;
        String sifre="";
        while (tekrarSifreIste){
            System.out.println("Lütfen sifrenizi giriniz: ");
            sifre=scan.nextLine();
            if (sifreKontrolEt(sifre)){
                System.out.println("Sifre basarili ile olusturuldu");
                //break; yazabiliriz loop bitsin diye ya da
                tekrarSifreIste=false; //yazabiliriz. çünkü false olmadığı müddetçe while loop dönecek
            }
        }


    }
    public static boolean sifreKontrolEt(String sifre){
        int flag=0;
        if (!(sifre.charAt(0)>='a'&& sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt((sifre.length()-1))<='9')){
            System.out.println("son karakter rakam olmali");
            flag++;
        }
        if ((sifre.contains(" "))){
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }
        if (!(sifre.length()>=10)){
            System.out.println("uzunluk on karakter olmali");
            flag++;
        }
        if (flag==0){
            return true;
        }else return false;
    }
}
