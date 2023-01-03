package ders20_constructor;

public class C02_Constructors {
    public static void main(String[] args) {
        /*
        Bir obje oluşturulurken istediğimiz özellikleri direk atayabilirsek
        sonradan tekrar bir atama işlemi yapmamıza gerek kalmaz. metottaki mantığı burda da kurabiliriz

        bu durumda atamayı tek tek bizi yapmamız yerine construcor'ın atama yapmasını istemeliyiz

        atama yapmak için constructora parametre yollaöalıyız
         */
        karesiniYazdir(5);//25
        karesiniYazdir(10);//100

        Car car1=new Car("BMW","5.20",2020,15000, "Beyaz");
        System.out.println(car1);//Car{marka='BMW', model='5.20', yil=2020, km=15000, renk='Beyaz'}

        Car car2=new Car("TOFAŞ","Şahin",2010);
        System.out.println(car2);//Car{marka='TOFAŞ', model='Şahin', yil=2010, km=0, renk='Renk secilmedi'}
        //girdigimiz degerlerin dışındakileri instance variable da ne varsa onu alacaktır

        Car car3=new Car("Toyota","Corolla",2016,"Gri");
        System.out.println(car3);//Car{marka='Toyota', model='Corolla', yil=2016, km=0, renk='Gri'}
    }

    public static void karesiniYazdir(int sayi){
        System.out.println(sayi*sayi);
    }
}
