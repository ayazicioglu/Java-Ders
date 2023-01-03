package ders21_staticKeyword;

import java.util.Arrays;

public class C06_PassByValueCokluElements {
    public static void main(String[] args) {
        int [] arr={3,6,8};
        //bir method olusturun
        //methodda array'e 5 elemetli yeni bir array atayın
        //ve yazdırın
        //main methoda dondukten sonra yine arrayi yazdırın
        arrayiDegistir(arr);
        System.out.println(Arrays.toString(arr));//[3, 6, 8]
    }
    public static void arrayiDegistir(int [] b){
        b=new int[5];
        System.out.println(Arrays.toString(b));//[0, 0, 0, 0, 0]
    }
}
