package ders10_StringMan_nul;

public class C08_forloop_ {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        for (int i=1; i<=1000;i++){
        int sayilarintoplami=0;
        System.out.print(i+" ");
        sayilarintoplami=sayilarintoplami+i;
        sayilarintoplami +=i;
            System.out.println(sayilarintoplami);
        }
    }
}