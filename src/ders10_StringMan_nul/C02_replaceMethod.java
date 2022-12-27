package ders10_StringMan_nul;

public class C02_replaceMethod {
    public static void main(String[] args) {
        String str="Java ogren, adana ye:)";
        System.out.println(str.replace('a', 'A'));

        System.out.println(str.replace(" ", ""));

        System.out.println(str.replace("Java", "Yazilim"));

        String telefon="555 3451234";
        System.out.println(telefon.replace("555", "532"));

        System.out.println(telefon.replace("3", "7"));

        String sonuc="1-16 of over 100,000 results for \"apple\"";

        int indexOver=sonuc.indexOf("over");
        int indexResults=sonuc.indexOf("results");

        String sonucSayisiStr=sonuc.substring(indexOver+5,indexResults-1);
        System.out.println(sonucSayisiStr);

        sonucSayisiStr=sonucSayisiStr.replace(",", "");
        System.out.println(sonucSayisiStr);

        int sonucSayisiInt=Integer.parseInt(sonucSayisiStr);

        if (sonucSayisiInt>10000)
            System.out.println("sonuc testi PASSED");
        else System.out.println("sonuc testi FAILED");


    }
}
