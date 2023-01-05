package ders24_StringBuilder;

public class C05_Encapsulation {
    public  static void main(String[] args) {
        /*
            Access modifiers bir class uyesine erisimi sinirlandirirken
            gorme yetkisi(read) ve degistirme yetkisini(write) ayirt edemez
            Ama gercek hayatta bu ihtiyac vardir
            Bazi class uyelerinin readable olmasi istenirken
            Bazi class uyelerinin sadece writeable olmasi istenir
            Ve bazi class uyeleri icin iki yetki de istenir
            Java bu yetkilendirme islemini Encapsulation ile cozmustur.
         */
        EncapsuleClass obj1=new EncapsuleClass();


        obj1.setSatis(100);

    }
}
