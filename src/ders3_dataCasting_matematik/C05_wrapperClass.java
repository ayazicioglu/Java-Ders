package ders3_dataCasting_matematik;

public class C05_wrapperClass {
    public static void main(String[] args) {
        int sayi=10;
        String sr="Java candir";

        Integer sayi2=20;

        String str2="123";
        String str3="354";

        int str2Int=Integer.parseInt(str2);
        int str3Int=Integer.parseInt(str3);

        System.out.println(str2Int+str3Int);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        char krkt1='$';
        System.out.println(Character.isAlphabetic(krkt1));
        System.out.println(Character.isDigit(krkt1));
        System.out.println(Character.isLetter(krkt1));

        short sayi3=4;
        int sayi5=sayi3;


    }
}
