package ders10_StringMan_nul;

public class C04_replaceFirstMe {
    public static void main(String[] args) {
        String str="Java heyecandir";

        //Eger tum a'ları degil de sadece ilk a'yi degistirmek istersek

        System.out.println(str.replaceFirst("a", "A"));
        System.out.println(str.replaceFirst("\\w", "*"));
    }
}
