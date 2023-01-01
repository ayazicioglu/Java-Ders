package ders17_Arrays;

public class C05_MuDiAr {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};
        //verilen iki katlı MDA'deki tüm sayiların toplamini yazdiran bir metot olusturalım
        tumSayilariTopla(arr);

    }
    public static void tumSayilariTopla(int[][] arr){
        int toplam=0;
        for (int i = 0; i < arr.length; i++) { //outer array icin
            for (int j = 0; j < arr[i].length; j++) {//inner array'ler icin

                toplam+= arr[i][j];

            }
        }
        System.out.println("Array'deki tüm sayilarin toplami: "+toplam);
    }
}
