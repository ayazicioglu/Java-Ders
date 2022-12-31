package ders16_arrays;

import java.util.Arrays;

public class c09_ArrayeYeniDegerAtama {
    public static void main(String[] args) {
        int[ ] arr1={1,2,3};

        //arr1={3,6,1,8}; böyle atama yaptırmaz
        //arr1={5,7,1}; uzunluk aynı olsa bile yaptırmaz

        //arr1=new int[5];//böyle atamayı yaptırır, eski array'ı silmez ama pointerını eski arrayden yenisine yönlendirir
        System.out.println(Arrays.toString(arr1));

        //eski elementleri de korumak istersek ne yapmalıyız?
        //o zaman atama yapmadan önce yeni array'ı hazırlamalıyız
        //bunun için boş bir yeni array oluşturup eski array'deki elementleri yeni array'e taşıyıp
        //sonra atamayı yapabiliriz

        int[] temp=new int[5];
        for (int i = 0; i <arr1.length; i++) {
            temp[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr1));//[1, 2, 3]
        System.out.println(Arrays.toString(temp));//[1, 2, 3, 0, 0]

        arr1=temp;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(temp));
    }
}
