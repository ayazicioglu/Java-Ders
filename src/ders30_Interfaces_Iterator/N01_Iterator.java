package ders30_Interfaces_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class N01_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);


        System.out.println(sayilar);
        //index yapisi kullanmadan tum elementleri 3 artırın

        for (Integer each:
             sayilar) {
           each=each+3;
            System.out.print(each+" ");
        }
        System.out.println("");
        System.out.println(sayilar);

        //index yapısnı kullanmadan tüm elementleri yazdırın

        Iterator itr= sayilar.iterator();
        System.out.println(itr.next());//5
        System.out.println(itr.next());//23
        System.out.println(itr.next());//2
        System.out.println(itr.next());//9
        System.out.println(itr.next());//11

        //tek tek yapmayıp bir loop ile yapalım
        System.out.println(itr.hasNext());//false sağın dolu mu diye soruyor bu hasNext
        //iterator nereye gittiyse orada kalır, geri dönemez
        //tüm listeyi loop ile yeniden yazdırmak için yeni bir itr oluşturmali veya iteratora yeni değer atamalıyız

        itr=sayilar.iterator();
        System.out.println(itr.hasNext());//true
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        //iterator kullanarak 5'den büyük sayilari silin
        itr=sayilar.iterator();
        while (itr.hasNext()){
           Integer sayi=(Integer) itr.next();
            if (sayi>5){
                itr.remove();
            }
        }
        System.out.println("");
        System.out.println(sayilar);


    }
}
