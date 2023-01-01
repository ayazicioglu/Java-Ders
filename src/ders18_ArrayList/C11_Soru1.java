package ders18_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C11_Soru1 {
    public static void main(String[] args) {
        //Verilen String bir listede istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren bir method olusturun

        List<String> isimler= C10_IsımSoru.isimListesiOlustur();
        System.out.println("İstenmeyen harfin olduğu isimler silindi.\n Kalan isimler: "+istenmeyenIsimleriSil(isimler));
    }

    public static List<String> istenmeyenIsimleriSil(List<String> isimler){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen istenmeyen harfi giriniz: ");
        String istenmeyenHarf=scan.next().substring(0,1);
        List<String> yeniListe=new ArrayList<>();
        for (int i = 0; i < isimler.size(); i++) {

            if (!isimler.get(i).contains(istenmeyenHarf)){
                yeniListe.add(isimler.get(i));
            }
        }
        return yeniListe;
    }
}
