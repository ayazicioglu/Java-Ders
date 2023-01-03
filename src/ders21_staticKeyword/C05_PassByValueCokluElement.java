package ders21_staticKeyword;

import java.util.Arrays;

public class C05_PassByValueCokluElement {
    public static void main(String[] args) {
        int [] arr={3,6,9,1,7};
        //Bir method olusturup arr yi methoda yollayalım
        //method da arrayin elementler üzerinde degisiklik yapalım ve arrayi yazdıralım
        elementleriDegistir(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void elementleriDegistir(int [] b){
        b[0]=13;
        b[2]=19;
        System.out.println(Arrays.toString(b));//[13, 6, 19, 1, 7]
    }
}
