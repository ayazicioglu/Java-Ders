package ders15_Scope_arrays;

public class c01_Hastane {
    static String hastaneIsmi= "Yıldız Hastanesi";
    static String hastaneAdresi= "Cankaya/Ankara";

    String personelIsmi;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {
        /*
        Eğer tüm metotlarda kullanılabilecek variable'lar oluşturmak istersek bunları class level'da oluştururuz.
        Class level'da oluşturulacak variable için 2 seçenek var
        1) static variable (Class variable)
        2) instance varable (static olmayan, obje variable)

        Kural-1: static variable'lar tüm objeler için tek bir değer alır (örn: hastane adı)
                instance variable'lar her obje için java tarafından oluşturulur.
        Kural-2: class level variable'lara değer atamasak dahi kullanabiliriz. Java default değerler atar.
                non-primitive'ler için ==> null (String)
                sayısal primitive'ler için==> 0
                char==> hiçlik ''
                boolean==> false
        Kural3- static olan method'lardan static olmayan variable ve method'lara direk ulasilmaz
                  instance variable ve static olmayan method'lari static alanlardan kullanmak isterseniz
                  obje uzerinden kullanabilirsiniz.
        Kural4- class'da olusturulan instance variable'lar ilk deger atamasini yapar
                  yani bir obje ilk olusturuldugunda otomatik olarak instance variable'a atanan degeri alir
                  deger atanmamissa default degerleri alir
                  obje olusturulduktan sonra obje uzerinden yapilan atamalar
                  class level'daki instance variable'a degil, java tarafindan olusturulup
                  objeye yapistirilan kopya variable'a yapilir
         Kural5- static variable'lar tum objeler icin ortaktir.
                 static variable'lara tum class'dan direk ulasilabilir
                 static variable'in degeri degisirse tum objeler icin degismis olur
         */
        c01_Hastane per1=new c01_Hastane();

        System.out.println(per1.personelIsmi);
        System.out.println(per1.personelAdresi);
        System.out.println(per1.personelTel);

        //System.out.println(personelIsmi); doğrudan ulaşamıyoruz görüldüğü gibi

        per1.personelIsmi="Fidan";
        per1.personelAdresi="Germany";
        per1.personelTel="+4942636353644";

        c01_Hastane per2=new c01_Hastane();
        System.out.println(per2.personelIsmi);
        per1.personelIsmi="Yusuf"; //yeniden atama yaptık,
        System.out.println(per2.personelIsmi);
        per2.personelIsmi="Ayten";
        System.out.println(per2.personelIsmi); //Ayten
        System.out.println(per1.personelIsmi); //Yusuf

        System.out.println(hastaneIsmi); //Yıldız Hastanesi
        System.out.println(per1.hastaneIsmi); //Yıldız Hastanesi
        per2.hastaneIsmi="Java Hastanesi";
        System.out.println(hastaneIsmi); //Java Hastanesi
        System.out.println(per1.hastaneIsmi);//Java Hastanesi
        System.out.println(per2.hastaneIsmi);//Java Hastanesi


    }
    public static void method1(){
        System.out.println(hastaneAdresi);
    }
    public void method2(){
        System.out.println(hastaneAdresi);
    }
}

