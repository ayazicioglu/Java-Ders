package ders19_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C08_constructors {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        List<Integer> sayilar=new ArrayList<>();

        //sayilar ArrayList class'ından olusturdugumuz bir obje'dir.
        //olusturuldugu class'daki tum ozelliklere(method ve variable'lar) sahiptir.
        /*
        Bir class'tan bir obje oluşturdugumuzda o class'taki tüm instance variable'ların bir kopyası
        olusturulup objemiz ile ilişkilendirilir. Ayrıca o class'ta bulunan tum metotlarda objemiz ile
        ilişiklendirilir. bunu sağlayan Java yapısı CONSTRUCTOR 'dir.
        bu isleme de initialize (ilk değer ataması) denir.

        new keyword ile obje olusturulurken eşitliğin sağında new ile birlikte classIsmi() yazılır
        işte bu classIsmi() o class'ın constructor'udur.

        constructor bugüne kadar gördugumuz yapılardan farklıdır.

        constructor bir obje olusturmak istedigimizde devreye girer ve ilgili sınıfın tüm özelliklerini
        obje ile ilişiklendirir. (initialize)
         */
    }
}
