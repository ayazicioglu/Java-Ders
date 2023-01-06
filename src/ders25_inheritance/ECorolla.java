package ders25_inheritance;

public class ECorolla extends DToyota{
    ECorolla(){

        System.out.println("Parametresiz Corolla constructor'ı çalıştı");
    }
    ECorolla(String param1){super("Gri");
        System.out.println(" String Parametreli corolla constructor çalıştı");

    }
    String model="Corolla";
    String uretimYeri="Türkiye";

    public static void main(String[] args) {
        ECorolla cor1=new ECorolla("Mavi");
    }
/*
Bir obje oluşturulduğunda ilk değer atamasi yapılabilmesi için constructor çalışmalıdır

Inheritance'de biliyoruz ki child class'dan oluşturula her obje parent
class'taki özelliklere de sahip olur

Parent class'taki özelliklere sahip olmasi için parent class2taki constructorlar
da çalışmalıdır.

Java bu çalışmayı super() constructor call sayesinde sağlar
Java'da her oluşturulan class'da  gorunmese dahi default constructor olduğu gibi
extends keyword kullanılan her class'da oluşturulan her consructor'in ilk
satirinda görünmese dahi super() constructor vardir.


 */



}
