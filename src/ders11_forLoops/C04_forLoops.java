package ders11_forLoops;

public class C04_forLoops {
    public static void main(String[] args) {
        //eger sarti dogru yazmazsak yani i nin hic bir degeri icin true olmuuyorsa
        //input olarak verilen sayidan 1 e kadar tüm sayilari yazdirin

        int input = -23;
        if (input > 1) {
            for (int i = input; i >= 1; i--) {
                System.out.print(i + " ");
            }
        } else
            for (int i = input; i <= 1; i++) {
                System.out.print(i + " ");
            }
    }

}