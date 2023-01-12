package ders09_StringManuplations;

public class C03_startsWithh {
    public static void main(String[] args) {

        String str1="Java mutluluktur";
        System.out.println(str1.startsWith("Java"));//true
        System.out.println(str1.startsWith("j"));//false
        System.out.println(str1.startsWith("Java mutluluktur"));//true
        System.out.println(str1.startsWith(""));//true

        System.out.println(str1.contains("mutlu"));//true
        System.out.println(str1.startsWith("mutlu"));//false

        System.out.println(str1.startsWith("mutlu",5));//true
        System.out.println(str1.startsWith("va",2));//true


    }
}
