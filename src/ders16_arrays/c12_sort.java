package ders16_arrays;

import java.util.Arrays;

public class c12_sort {
    public static void main(String[] args) {
        //verilen bir array'i Natural Order'a göre sıralayıp yazdıralım

        String [] isimler={"Hüseyin","Yusuf","Mehmet","Akile","Said","Mahmut","ahmet","adnan"};
        System.out.println(Arrays.toString(isimler));

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        //Eğer buyukten kucuge siralamak istersek, once sart kullanarak natural order'a göre sıralar
        //sonra gecici bir array kullanarak siralamayi tersine cevirirriz


    }
}
