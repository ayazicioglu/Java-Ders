package ders21_staticKeyword;

public class C02_PassByValues {
    public static void main(String[] args) {
        int fiyat=100;
        //fiyat üzerinden %10 indirim yapıp indirimli fiyatı döndüren bir metot oluşturun

        /*
        java pass by value kullanır. yani methodlar arasında gönderilen variable'ların kendileri degil,
         value'ları diger methoda yollanır
         */

        System.out.println(indirimHesapla10(fiyat));//90 değişkeni (fiyatı) metoddaki a yerine yazar

        System.out.println(fiyat);//100

        //eğer indirimli fiyatın kalıcı olmasını istersek şöyle atama yaparız.
        fiyat=indirimHesapla10(fiyat);
    }
    public static int indirimHesapla10(int a){
        a=a*90/100;
        return a;
    }
}
