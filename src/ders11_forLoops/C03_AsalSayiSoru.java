package ders11_forLoops;

public class C03_AsalSayiSoru {
    public static void main(String[] args) {
        //input olarak verilen bir tamsayinin
        //asal sayi olup olmadigini yazdirin

        int input=28;
        String sonuc="Sayi Asal";
        for (int i = 2; i < input; i++) {
            //System.out.println(i); //burası denedigi değerleri yazdırır
            if (input%i==0){
                sonuc="Sayi Asal Degil";
                           break; //java bir loop icinde break görürse o loop u bitirir
            }

        }
        System.out.println(sonuc);
    }
}
