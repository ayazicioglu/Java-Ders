package ders19_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_2katliForEachLoops {
    public static void main(String[] args) {


        int[] arr1={3,5,6,1,3,7};
        int[] arr2={3,8,9,4,5,11};

        List<Integer> ortakElementler=new ArrayList<>();
        for (int eachArr1: arr1
             ) {
            for (int eachArr2:arr2
                 ) {
                if (eachArr1==eachArr2){ //bu ikisi eşitse aşağıdaki kod çalışacağı için eachArr1 veya 2 yazmanın farkı
                    if (!ortakElementler.contains(eachArr1)){//yok. aynı şekilde ortakelementlerde de aechArr1 yada 2
                        ortakElementler.add(eachArr1);//farketmez
                    }
                }
            }
        }
        System.out.println(ortakElementler);
    }
}
