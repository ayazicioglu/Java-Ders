package ders9_StringManuplations;

public class C05_indexOff {
    public static void main(String[] args) {
        String str="Java ile kodlama cok kolay";

        //str cok iceriyor mu
        System.out.println(str.contains("cok"));

        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('v'));
        System.out.println(str.indexOf("cok"));

        System.out.println(str.indexOf("a", 5));


    }
}
