package ders16_arrays;

import java.util.Arrays;

public class c03_Soru {
    public static void main(String[] args) {
        //verilen bir int array'deki tüm elementleri 5 artırın

        int [] arr={2,4,6,8};

        for (int i = 0; i < arr.length; i++) {

            arr[i]+=5; // arr[i]=5+arr[i]
        }

        System.out.println(Arrays.toString(arr)); //[7, 9, 11, 13]
    }
}
