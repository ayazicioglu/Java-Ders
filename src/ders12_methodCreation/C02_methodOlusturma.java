package ders12_methodCreation;

public class C02_methodOlusturma {
    public static void main(String[] args) {
        //verilen iki sayiyi çarpip sonucu yazdiran bir metot olusturalim;
        // bir metot ancak method call yapıldığında çalışır.
        //method call için metot adı ve parametrelere uygun argument yazılmalıdır
        carpYazdir(5,8);
        carpYazdir(7.4,8.6);
    }

        //metotlar class ın içinde ama main metodun dışında oluşturulur. metot içinde metot olmaz
        public static void carpYazdir(double sayi1, double sayi2){
            System.out.println(sayi1 * sayi2);
        }
}

