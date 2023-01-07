package ders27_Overriding;

public class GExceptions {
    public static void main(String[] args) {
        int a=23;
        int b=0;



        //bolen sayinin 0 olmasi bu koddda ongörülecebilecek bir risk'dir
        //kodumuzu yazarken bu riski cozebilecek sekilde kod yazabiliriz

        if ((b!=0)){
            System.out.println("Iki sayinin bolumu: "+a/b);
        }else {
            System.out.println("Bolecek sayi sifir olamaz");
        }


    }
}
