package ders10_StringMan_nul;

public class C10_forloop_ {
    public static void main(String[] args) {
        int inputBas=34;
        int inputBit=563;
        int sayac=0;
        int toplam=0;

        for (int i = inputBas; i <=inputBit ; i+=7) {
            System.out.print(i+" ");
            sayac++;
            toplam+=i;
        }
        System.out.println("Toplam "+sayac+" adet sayi var\nBu sayilarin toplamı: " +toplam);
    }
}
