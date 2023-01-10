package ders30_Interfaces_Iterator;

public interface I01_Interface {
    //Interface'lerde tüm methodlar default olarak hepsi PUBLIC ve ABSTRACT dır. Gri renklere bak yazmana gerek
    //yok zaten hepsi öyle diyor Intellij
    //Interface'lerde tüm variable'lar public,static ve final'dir.
    //Sonradan değer atamak mümkün olmayacağından başlangıçta değerini vermek zorundayız.

    int SAYI=10;
    public static final String okulIsmi="Yildiz Koleji";
    public int SAYI2=20;

    void method1();
    public int method2();
    abstract String method3();
    public abstract void method4();
    void method5();
    public default void method44(){}
}
