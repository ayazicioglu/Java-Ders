package ders10_StringMan_nul;

public class C05_replaceSorusu {
    public static void main(String[] args) {
        String str=" Evden calisiyorum, sirkete gitmeye gerek yok";

        String calisilacakstr=str.toLowerCase();

        if (calisilacakstr.contains("ev")&&calisilacakstr.contains(" is")) {
            System.out.println("hem ev lazim hem is");
        } else if (calisilacakstr.contains("is")) {
            System.out.println("calismak güzeldir");}
        else if (calisilacakstr.contains("ev")) {
            System.out.println("home sweet home");
        }else System.out.println("cok calismaliyiz");
        }

    }


