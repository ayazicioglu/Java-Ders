package ders16_arrays;

import java.util.Arrays;

public class c01_arrays {
    public static void main(String[] args) {

        String [] arr1=new String[4];//[null,null,null,null]

        int [] arr2={3,4,5,6,7,8};

        System.out.println(arr2[2]);//5
        System.out.println(arr1[3]);//null
       // System.out.println(arr1[8]); ArrayIndexOutOfBoundsException

        arr2[2]=15;
        arr2[0]=7;
        //tüm array'i yazdıralım
        System.out.println(arr2); //[I@58ceff1

        //Array'in tamamını yazdirmak istersek Arrays class'ından yardım almalıyız

        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(arr1)); //arrayı yazdırırı: [null, null, null, null]

        System.out.println(arr1[2]);// array'ın 2. lementindekni yazdırır: null
    }
}
