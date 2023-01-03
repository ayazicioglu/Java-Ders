package ders19_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArraydenListYapmak {
    public static void main(String[] args) {
        Integer[] arr={2,3,4,6,3,4,6,1,8,5,4};
        /*
        Verilen bir array'i list'e cevirmek icin 2 yöntem vardir;
        1- bir loop ile tum elementleri list'e kopyalamak
        2- asList() methodunu kullanmak(tavsiye edilmiyor)
        cunku iki buyuk dezavantajı var:
        -asList ile olusturulan list array'den donusturuldugu icin add, remove gibi size'i degistiren
          metodlar kullanamayız
        -asList ile olusturdugumuz list2 baglı oldugu array birbirine bagimli olur. birinde yapacagimiz
        degisiklik digerini de etkiler. 34,35,36. satırlarda örnegi var
         */

        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list1.add(arr[i]);
        }
        System.out.println("loop ile tasinan list: "+list1);


        //as list ile yapalım
        List<Integer> list2= Arrays.asList(arr);
        System.out.println("as list ile olusturulan list:" +list2);

       // list2.add(6); kod normal görünür ama konsolda hata verir

        arr[0]=10;
        System.out.println(Arrays.toString(arr));//[10, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4]
        System.out.println(list2);//[10, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4] gordugun gibi list2 yi de degistirdi

    }

}
