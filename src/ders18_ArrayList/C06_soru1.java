package ders18_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_soru1 {
    public static void main(String[] args) {
        //verilen bir array'deki tekrar eden elementleri silip
        //array'i unique değerlerden oluşab bir array haline getirin

        int[] arr={4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};

        List<Integer> benzersizElementler=new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            if (!benzersizElementler.contains(arr[i])){
                benzersizElementler.add(arr[i]);

            }


        }
        System.out.println(benzersizElementler);//[4, 3, 6, 7, 5] bir liste elde ettik ama array hale getirmeliyiz
        arr=new int[benzersizElementler.size()];//[0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {
            arr[i]= benzersizElementler.get(i);

        }
        System.out.println("Array'in son hali: "+ Arrays.toString(arr));//Array'in son hali: [4, 3, 6, 7, 5]
    }
}
