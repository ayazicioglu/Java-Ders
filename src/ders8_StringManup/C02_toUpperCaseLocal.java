package ders8_StringManup;

import java.util.Locale;

public class C02_toUpperCaseLocal {
    public static void main(String[] args) {
        String str="JAVA CANDIR";
        System.out.println(str.toLowerCase());
        str=str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);

        str="sevgi insanı hayata bağlar";
        System.out.println(str.toUpperCase());

        str=str.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);
    }
}
