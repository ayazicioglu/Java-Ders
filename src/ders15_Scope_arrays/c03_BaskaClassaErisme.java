package ders15_Scope_arrays;

public class c03_BaskaClassaErisme {
    public static void main(String[] args) {
        /*
        java OOP konsept cercevesinde baska class'lardaki class uyelerini (variable/method) kullanabiliriz
        Baska class'daki herhangi bir class uyesine erismek istedigimizde static keyword önemli bir rol oynar

        >>static olarak isaretlenen class uyelerine classIsmi.staticuyeIsmi şeklinde ulasabiliriz
        >>static olmayan class uyelerine erisebilmek icin obje olusturmamız gerekebilir.

        Java runtime programdır. basınca calışır, calıştığı sürece yapılan işlemleri kalıcı olarak tutar,
        çalışma bittiğinde herşey YOK OLUR
         */
        System.out.println(c01_Hastane.hastaneAdresi);//Cankaya/Ankara
        c01_Hastane.method1();//Cankaya/Ankara
        System.out.println(c01_Hastane.hastaneIsmi);//Yıldız Hastanesi

        c01_Hastane per1=new c01_Hastane();
        System.out.println(per1.personelAdresi);//null

        System.out.println(per1.hastaneIsmi);//Yıldız
        per1.personelIsmi="Belkıs";
        per1.personelAdresi="İstanbul";
        per1.hastaneAdresi="Üsküdar";

        System.out.println(per1.personelIsmi);//Belkıs
        System.out.println(per1.personelAdresi);//İstanbul
        System.out.println(per1.personelTel);//null
        System.out.println(per1.hastaneIsmi);//Yıldız
        System.out.println(per1.hastaneAdresi);//Üsküdar

    }
}
