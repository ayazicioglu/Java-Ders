package ders30_Interfaces_Iterator.TekrarDersi;

public interface I01_Interface {
   //Interface'lerde tüm method'lar public ve abstract'tir
    //Interface'ler de tüm variable'lar public,static ve final'dir
    //final olduğundan sonradan değer atamak mümkün olmaz oluştururken değer atanmalıdır

    int SAYI=10;
    public static final String okulIsmi="Yıldız Koleji";
    public int SAYI2=20;

    void method1();
    public int method2();
    abstract String method();
    public abstract void method4();
    void method5();
    /*
            Bir interface'e sonradan bir method eklemek istedigimizde
            o interface'i daha once implement eden tum class'lar
            yeni eklenen method'u implement etmek zorunda olur.
            Java'ya yapilan talepler sonucunda
            Java8 ile birlikte bu konuda bir istisna getirilmistir
            Eger sonradan eklenen method'un tum eski class'lar tarafindan implement edilme mecburiyeti
            olmasin istiyorsaniz
            yeni olusturdugunuz method'a DEFAULT veya STATIC keyword ekleyip
            body de olusturursaniz
            o zaman bu method'un child class'lar tarafindan
            implement edilme MECBURIYETI OLMAZ
         */
    public default void method44(){
        System.out.println("Interface'deki default olarak isaretlenen method calisti");
    }
    public static void method34(){
        System.out.println("Interface'deki static olarak isaretlenen method calisti");
    }
}
