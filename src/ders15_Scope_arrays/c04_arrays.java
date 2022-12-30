package ders15_Scope_arrays;

public class c04_arrays {
    public static void main(String[] args) {
        int [] arr={1,2,3}; //bu şekilde yazıldığında kaç element yazıldı ise onu length olarak kabul eder
        int arr2[]={4,5,6,7,8,9}; //intelliJ [] isimden sonra yazmayı çok sevmiyo ama ikiside kullabılır.

        String[] harfler=new String[4000];
        System.out.println(arr.length);//3
        System.out.println(arr2.length);//6
        System.out.println(harfler.length);//4000
        /*
            String de kullandığımız harfler.length() bir metot iken;
            Array deki length method değil variabla'dir. arr.length
         */

    }
}
