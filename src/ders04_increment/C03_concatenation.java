package ders04_increment;

public class C03_concatenation {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String str1="";
        String str2=" ";
        String str3="-";

        System.out.println(a+b);
        System.out.println(str1+a+b);
        System.out.println(a+str2+b);
        System.out.println(a+b+str3);
        System.out.println(str1+a*b);
        System.out.println(str2+(a+b));
    }
}
