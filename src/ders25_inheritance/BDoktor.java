package ders25_inheritance;

public class BDoktor extends APersonel{
    /*
    Oluşturduğumuz doktor class'ında isim soyisim gibi
    Persınel class'ında olusturullan tum ozelliklerin olmasini istiyoruz
    1- istenen tüm özellikleri Doktor class'ında el yordamıyla yeniden oluşturabiliriiz
    2_ Doktor class'ını personelin child'i yapmak

    Doktor class'ını personel class'ının child'ı yaptığımızda
    Doktor class'ından oluşturulan objeler sadece kendi class'ında oluşturulan
    özelliklere sahip olmaz;
    aynı zamanda parent class'i olan personel'deki özelliklere de sahip olurlar
    Bir child class'dan obje olusturdugumuzda o objenin özeliklerini belirlerken
    önce kendi class'ina bakilir ve o ozellik varsa kullanilir
    eger kendi class'ında yoksa parent class'a bakilir

    Bir class extends keyword kullanarak baska bir class'i kendisine parent edinirse;
    1-parent class'daki tüm özellikleri direk kullanabilir(isim,soyisim,telefon,ozelSigorta)
    2-isterse parent class'da olan bir özelliği kendisine uyarlayabilir/modifiye edebilir (maas)
    3-isterse parent class'da olmayan yeni özellikler(method/veriable) oluşturabilir (nobet)
     */
    public static void main(String[] args) {
        BDoktor doktor1=new BDoktor();
        doktor1.isim="Kemal";
        doktor1.soyisim="Bulut";

        System.out.println(doktor1.isim+","+doktor1.soyisim+","+doktor1.telefon);
        //Kemal,Bulut,Telefon atanmadi
    doktor1.maas();//bu class ta maas var
    doktor1.ozelSigorta();//parent dan çağırdık
    doktor1.nobet();
    }


    public void maas(){
        System.out.println("Doktor maasi 30*8*25: "+6000);
    }
    public void nobet(){
        System.out.println("Doktorlar haftada 1 gun nobet tutar");
    }
}
