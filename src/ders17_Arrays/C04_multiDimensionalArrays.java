package ders17_Arrays;

import java.util.Arrays;

public class C04_multiDimensionalArrays {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        System.out.println(arr.length);//5
        System.out.println(arr[2].length);//4
        System.out.println(arr[2][1]);//7
        System.out.println(arr[3]);//[I@58ceff1

        //multidimensional array ile calisirken dikkat etmemeiz gereken en önemli konu
        //yazdigimiz kodun bir array mi yoksa yazdirabilecegimiz bir element mi döndürür

        System.out.println(Arrays.toString(arr[3]));//[2]

        // 2 elementini yazdırmak istersek
        System.out.println(arr[3][0]);//2

        //multidimensionalArray ın tümünü yazdırmak istersek tek katlılarınki gibi olmaz

        System.out.println(Arrays.toString(arr));//[[I@58ceff1, [I@7c30a502, [I@49e4cb85, [I@48140564, [I@2133c8f8]
        //deeptoString kullanarak yapmalıyız
        System.out.println(Arrays.deepToString(arr));//[[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]
    }
}
