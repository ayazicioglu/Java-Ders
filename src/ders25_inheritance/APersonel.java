package ders25_inheritance;

public class APersonel {
   protected String isim="Isim atanmadi";
   protected String soyisim="Soyisim atanmadi";
   protected String telefon="Telefon atanmadi";

    protected void maas(){
        System.out.println("Hastanemizde uygulanan asgari ücret: "+1700);
    }
    protected void ozelSigorta(){
        System.out.println("Tüm personelin özel sağlık sigortasi yaptirilir ");
    }
    private void privateMethod(){
        System.out.println("privateMethod calisti");
    }
}
