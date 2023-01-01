package ders18_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_IsımSoru {
    public static void main(String[] args) {
        //Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.
        isimListesiOlustur();
        List<String> isimlerListesi= isimListesiOlustur();


    }

    public static List<String> isimListesiOlustur(){
        List<String> isimlistesi=new ArrayList<>();
        String girilenIsim="";
        Scanner scan=new Scanner(System.in);
        while (!girilenIsim.equalsIgnoreCase("Q")){
            System.out.println("Listeye eklemek icin bir isim giriniz:\nBitirmek icin Q ya basin ");
            girilenIsim=scan.nextLine();
            if (!girilenIsim.equalsIgnoreCase("Q")){
                isimlistesi.add(girilenIsim);
            }
        }
        return isimlistesi;
    }
}
