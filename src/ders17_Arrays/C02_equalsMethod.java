package ders17_Arrays;

import java.util.Arrays;

public class C02_equalsMethod {
    public static void main(String[] args) {
        int[] arr1={3,8,0};
        int[] arr2={8,3,0};

        System.out.println(Arrays.equals(arr1, arr2));

        //equals method'u hem elementleri hem de index'leri kontrol edere
        //ayni indekslerde aynı elemetler varsa true, yoksa false dönner

        //eğer siralamadan dolayı false dönmesini istemiyorsak sort yaparız

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
