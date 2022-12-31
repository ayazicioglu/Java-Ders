package ders16_arrays;

public class c07_soru {
    public static void main(String[] args) {
        //verilen bir array'de istenen bir elemanın var olup olmadığını
        //ve varsa kaç kere kullanıldığını yazdıran bir metot oluşturalım
        int[] arr={2,3,4,2,5,2,6,7,4,5,1,2,4,6,3,1,9};
        int aranansayi=2;

        elemaniBul(arr,aranansayi);//Aradiginiz 2 array'de 4 adet kullanılmıştır.
        elemaniBul(arr,8);//Aranan sayi array'de yok
        elemaniBul(arr,5);//Aradiginiz 5 array'de 2 adet kullanılmıştır.
    }
    public static void elemaniBul(int[] arr,int aranansayi){
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==aranansayi){
                sayac++;
            }
        }
            if (sayac==0){
                System.out.println("Aranan sayi array'de yok");
            }else System.out.println("Aradiginiz "+aranansayi+" array'de "+sayac+" adet kullanılmıştır.");

    }
}

