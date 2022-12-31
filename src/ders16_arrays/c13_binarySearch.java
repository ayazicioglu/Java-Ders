package ders16_arrays;

import java.util.Arrays;

public class c13_binarySearch {
    public static void main(String[] args) {
        //binary tree javanın kullandığı özel bir sıralama yöntemidir.
        //binary search metodu binaryTree ozelligini kullandigindan
        //sirali olmayan array'lerde doğru sonuc dondurmeyebilir
        //öncesinde MUTLAKA sort() kullanılmalidir.
        int[] arr={2,6,9,3,15,1,7};

        System.out.println(Arrays.binarySearch(arr, 2));


        Arrays.sort(arr);//sıralma metodu
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 6, 7, 9, 15]

        System.out.println(Arrays.binarySearch(arr, 7));//indeks 2 dönecektir
    }
}
