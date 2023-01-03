package ders20_constructor;

public class Car {
    /*

     */
    String marka="Marka belirtilmemiş";
    String model="Model belirtilmemiş";
    int yil=1900;
    int km;
    String renk="Renk secilmedi";

    public Car(String marka, String model, int yil) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
    }

    public static void hareket(){
        System.out.println("Tüm arabalar hareket eder");
    }
    public Car(){}
    public Car(String mrk, String mdl, int yl, int kmetre, String rnk){
        marka=mrk;
        model=mdl;
        yil=yl;
        km=kmetre;
        renk=rnk;

    }

    public Car(String marka, String model, int yil, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
    }

    /*
    Bir class'da görünür bir constructor yazdığımızda Java default contructoru siler
    Bu durumda daha önceden default constructorı kullanarak obje oluşturan classlarda CTE oluşur
    Bunu aşmak için bir const. oluşturdugumuzda bir tane de parametresiz cont. oluştururuz

    onstructor'da parametre olarak kullanicidan gelen degeri
        class level'daki instance variable'a atamaliyiz
        eger parametre ismi ile instance variable ismi farkli ise sorun yok
        java otomatik olarak atamamizi anlayacaktir
        public Car(String mrk, String mdl, int yl, int kmetre, String rnk) gibi
                marka=mrk;
                model=mdl;
                yil=yl;
                km=kmetre;
                renk=rnk;
        Eger parametre isimlerini anlasilir olmasi icin instance variable ile ayni yaparsak
        Java'nin ayni isimdeki iki variable'in hangisinin parametre, hangisinin instance olacagini bilmesi gerekir
        bu durumda instance variable'i belirlemek icin basina this. yazariz
        public Car(String marka, String model, int yil)
        this.marka=marka;
        this.model=model;
        this.yil=yil;
     */








    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", km=" + km +
                ", renk='" + renk + '\'' +
                '}';
    }
}
