package ders22_ImmutableClasses;

import java.util.Arrays;
import java.util.Locale;

public class C02_ImmutableClasses {
    public static void main(String[] args) {
        String str="Java";
        System.out.println(str.toUpperCase());//JAVA
        str.toLowerCase();
        System.out.println(str);//Java
        //String immutable oldugundan, method'lar kalici değişiklik yapamaz

        int[] arr={9,5,17};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //Array mutable bir class olduğu için method ile yaptigimiz değişiklik kalici olur

    }
}
