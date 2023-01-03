package ders21_staticKeyword;

public class C03_PassByValues {
    public static void main(String[] args) {
        int s=20;
        System.out.println(s);//20

       // int s=30;  >>>bir scope da tanımlanan variable'ın yeniden tanımlanma imkanı yoktur.
        // String s="Hasan"; >>>data turunun değiştirilmesi de mümkün değildir.
        // cünkü kullanirken variable'ın isimini yazdıgımızda hangi sayi variable'ını kullanacağı mechul olur
        //java belirsizliği sevmez
        method1();
    }
    public static void method1(){
        method2(5);
        String s="Hasan";
        System.out.println(s.toLowerCase());//hasan
    }
    public static void method2(int s){
        s=s*s;
        System.out.println(s);
    }
}
