package ders9_StringManuplations;

public class C02_containss {
    public static void main(String[] args) {
        String str1="Java ogren mutlu ol";
        // str1 mutlu içeriyor mu?

        System.out.println(str1.contains("mutlu")); //true

        System.out.println(str1.contains(" ")); //true

        //contains metodu sadece "içeriiir" olduğuna bakar. true yada false tur cevabı

        System.out.println(str1.contains("Java")&&str1.contains("mutlu"));


    }
}
