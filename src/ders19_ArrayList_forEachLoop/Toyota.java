package ders19_ArrayList_forEachLoop;

public class Toyota {

    String marka="Toyota";
    String model="Model belirtilmemiş";
    int yil;
    int km;
    String renk;

    //default constructor şuna benzer;
    public Toyota(){
        System.out.println("Toyota class'indaki cons. calisti");
    }
    /*
    Bir kod blogunun constructor olup olmadigini anlamak icin 2 şeye bakmaliyiz
    1- Constructor class ismi ile ayni isimde olmalidir. (dolayisiyla cons. isimleri buyuk harfle başlar)
    2- Constructor'larin return type'i olmaz
     */
    /*
    Java'da her class obje uretmek uzere olusturulur.
    bir obje olusturulup ilk deger ataması yapılabilmesi icin de MUTLAKA constructor calışmalıdır.
    Java'da her class'da mutlaka CONSTRUCTOR BULUNUR
    Her class'ta bizim constructor olusturmamıza gerek kalmaması icin Java her class'a default constructor koyar

    default constructor GORUNMEZ
    default constructor parametresi olmayan ve body'sinde hic kod bulunmayan bir constructor'dir.

    Bir class'da gozlerimizle bir constructor gormuyorsak o class'da default contstructor vardir.

    eger kullanici tarafindan gözle görünür bir constructor yazılırsa Java default değerleri siler
     */
}
