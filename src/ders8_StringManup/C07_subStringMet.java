package ders8_StringManup;

public class C07_subStringMet {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";
        System.out.println(str.length());
        System.out.println(str.charAt(19/2));

        System.out.println(str.charAt(str.length()-1)); //son karakteri yazdırır

        //
        System.out.println(str.substring(5, 9));


        System.out.println(str.substring(5,10));

        System.out.println(str.substring(0,4).toUpperCase());

        System.out.println(str.substring(16,19)); //kap
        System.out.println(str.substring(16));//kap
        System.out.println(str.substring(str.length()-3));//kap

        System.out.println(str.substring(0,1));

        System.out.println(str.substring(9,10).toUpperCase());
        System.out.println(str.charAt(9));

        System.out.println(str.substring(5,5));
        System.out.println("**********");

       // System.out.println(str.substring(25,28));

        System.out.println(str.substring(str.length()));
        System.out.println("**********");

    }
}
