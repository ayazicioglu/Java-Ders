package ders16_arrays;

public class c06_Soru_Market {
    public static void main(String[] args) {
        //Bir marketin fiyatarini tutan bir array var
        //bu marketteki en yüksek ve en düşük fiyatları yazdran bir metot oluşturalım

        double[] fiyatlar={230,34.5,42.1,5.7,3.4,23.5};
        enYuksekVeenDusukFiyatYazdir(fiyatlar);
    }
    public static void enYuksekVeenDusukFiyatYazdir(double[] fiyatlar){
        double enDusukFiyat=fiyatlar[0];
        double enYuksekiyat=fiyatlar[0];

        for (int i = 0; i < fiyatlar.length; i++) {
           if ( fiyatlar[i]<enDusukFiyat){
               enDusukFiyat=fiyatlar[i];
           }
            if (fiyatlar[i]>enYuksekiyat){
                enYuksekiyat=fiyatlar[i];
            }
        }
        System.out.println("Listedeki en düşük fiyat: "+enDusukFiyat);
        System.out.println("Listdeki en yüksek fiyat: "+enYuksekiyat);
    }
}
