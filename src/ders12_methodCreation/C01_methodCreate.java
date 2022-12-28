package ders12_methodCreation;

public class C01_methodCreate {
    public static void main(String[] args) {
        String str="Java'da yolu yarıladık";

        str.isEmpty();//boolean bir sonuc döndü ama kullanmadık. metodun dondordogu sonucu kullanmak istersek
                        //ya yazdiririz
        System.out.println(str.isEmpty());

        str.isBlank();
        System.out.println(str.isEmpty());

        // ya da donen sonucu ilerde kullanacaksak atama yapabiliriz.

        str.toUpperCase();
        String buyukHarfHali= str.toUpperCase();

    }
}
