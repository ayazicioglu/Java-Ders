package ders14_doWhileLoop_Scoope;

public class C04_doWhileSorus2 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        bulunuz, tamkare ise true değilse false yazdırınız.
        Ornek : input : 16, output: 4
         */

        int girilenSayi = 144;
        int karekok = 1;
        boolean sonuc = false;


        while (karekok * karekok <= girilenSayi) {
            if (karekok * karekok == girilenSayi) {
                System.out.println("Girilen sayinin karekok: " + karekok);
                sonuc = true;
                break;
            } else {
                karekok++;
            }
        }
        System.out.println(sonuc);
        do {  //aynı soruyu do while ile yapıyoruz
            if (karekok * karekok == girilenSayi) {
                System.out.println("Girilen sayinin karekok: " + karekok);
                sonuc = true;
                break;
            } else {
                karekok++;
            }
        }while (karekok * karekok < girilenSayi);
                System.out.println(sonuc);

        }
    }
