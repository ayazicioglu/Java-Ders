package ders09_StringManuplations;

public class C07_ilkTest1 {
    public static void main(String[] args) {
        // Gittigimiz web sayfasindan aldigimiz
        // String arama sonuclarinda
        // arama sayisinin 50'den fazla oldugunu test edin

        String str="nutella";
        String input = "1-48 of 87 results for \"nutella\"";

        int indexOf=input.indexOf("of");
        int indexRes=input.indexOf("results");

        String sonucSayisiİndex=input.substring(indexOf+3,indexRes-1);
        System.out.println(sonucSayisiİndex);

        int sonucSayisiInt=Integer.parseInt(sonucSayisiİndex);
        if (sonucSayisiInt>50)
        System.out.println("nutella testi PASSED");
        else System.out.println("arama testi FAILED");
    }
}
