package ders14_doWhileLoop_Scoope;

public class C03_DoWhileSorusu {
    public static void main(String[] args) {
        //verilen başlangıç ve bitiş karakterleri dahil aradaki tüm karakterleri yazdırın
        char baslangic='d';
        char bitis='m';

        do {
            System.out.print(baslangic+" ");
            baslangic=(char)(baslangic+1);
        }while (baslangic<=bitis);
    }
}
