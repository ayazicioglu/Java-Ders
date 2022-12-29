package ders14_doWhileLoop_Scoope;

public class S05_ScopeKonu {
    int sayi=10;
    static int number;

    public static void main(String[] args) {
        String mainStr="Java";
        number=10;
        //sayi=20;
        //System.out.println(method2Str); kullanamadık

        for (int i = 0; i < 10; i++) {
            int toplam=i;
        }
        //System.out.println(toplam); for loop içindeki variable'ı başka yerde kullanamadık
        //System.out.println(i);


    }
    public static void method1(){
        String method1Str="Güzeldir";
        number=20;
        //sayi=20; kullanamadık
        //System.out.println(mainStr); kullanamadık
    }
    public void method2(){
        String method2Str="Candir";
        number=30;
        sayi=20;
        //System.out.println(mainStr); kullanamadık
    }
}
