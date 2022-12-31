package ders16_arrays;

import java.util.Arrays;

public class c02_arrays {
    public static void main(String[] args) {
                //verilen bir String array'in tüm elementlerini yazdırın

        String[] isimler={"Hüseyin","Yusuf","Mehmet","Akile","Said"};

        System.out.println(Arrays.toString(isimler));//[Hüseyin, Yusuf, Mehmet, Akile, Said] Javanın yazdırdığı

        for (int i = 0; i < isimler.length; i++) {
            System.out.print(isimler[i]+" "); //Hüseyin Yusuf Mehmet Akile Said

        }
    }
}
