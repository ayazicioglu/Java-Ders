package ders19_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_forEachSorusu {
    public static void main(String[] args) {
        //Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip, tum elemanlardan  sadece 1 tane yapip
        // eski array’e yeni halini atayip yazdirin.
        Integer[] arr={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> list1=new ArrayList<>();

        for (Integer each:arr
             ) {
            if (!list1.contains(each)) {
                list1.add(each);
            }
        }// list olarak unique degerlerden olusan bir list olusturduk

        arr=new Integer[list1.size()];
        // simdi list'deki elementleri array'e kopyalayalim
        // array'e atama yapmak icin index'e ihtiyacimiz oldugundan
        // for-each loop kullanmak pratik degil

        for (int i = 0; i < arr.length; i++) {
            arr[i]=list1.get(i);
        }
        System.out.println("Array'in yen hali: "+ Arrays.toString(arr));
    }
}
