package ders24_StringBuilder;

public class EncapsuleClass {
    public void setSatis(int satis) {
        this.satis = satis;
    }

    /*
        Java class uyelerine erisimin write and olarak ayrilmasi istendiğinde Encapsulation kullanir.
        Bunun için öncelikle bu class uyelerine normal yollarla erişim kapatılır

        Sonra istediğimiz yetkiyi verecek public method oluştururuz
         */
    private int satis;//satış bölümünden değer girilebilsin ama değeri görünmesin
    private int rapor=100;//görülebilsin ama değiştirilemesin
    private int halkaAcikSayi=10;//herkese açık olsun
}
