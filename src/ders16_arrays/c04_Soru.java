package ders16_arrays;

import java.util.Arrays;

public class c04_Soru {
    public static void main(String[] args) {
        //verilen bir String Array'de
        //istenen bir harfi içeren kelimeleri silip yerine null yazdırın

        String[] isimler={"Hüseyin","Yusuf","Mehmet","Akile","Said"};
        String silinecekHarf="u";
        for (int i = 0; i < isimler.length; i++) {
            if(isimler[i].contains(silinecekHarf)){
                isimler[i]=null;
            }
        }
        System.out.println(Arrays.toString(isimler));
    }
}
