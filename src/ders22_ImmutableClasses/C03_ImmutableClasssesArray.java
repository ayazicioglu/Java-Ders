package ders22_ImmutableClasses;

public class C03_ImmutableClasssesArray {
    public static void main(String[] args) {
        String str="Java";
        str=str.replace("J","H");//atama yapildigi icin degisti gibi görünüyor
        System.out.println(str);//Hava

        str=str.toLowerCase();
        System.out.println(str);//hava

        //Asagidaki kod calisirsa Java kac obje olusturur?

        String a="ABC";
        for (int i = 0; i < 10; i++) {
            a=a+i;

        }
        System.out.println(a);
    }
}
