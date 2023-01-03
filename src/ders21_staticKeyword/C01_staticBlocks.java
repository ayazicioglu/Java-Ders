package ders21_staticKeyword;

public class C01_staticBlocks {

    C01_staticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("Main metot çalışmaya başladı");
    }
    static {//static blocklar classtaki tüm yapılardan hatta main methoddan bile önce calisir
        System.out.println("Static block çalıştı");
    }
    static {//methodlarin ve static blocklarin siralaması java açısından önemli değildr.
            //ancak birden fazla static block varsa önce üstteki çalışır
        System.out.println("Alttaki static block calişti");
    }

    //static block niye vardır ne işe yarayacak?
    //static block'da istediğimiz bir variable'a başlangıç değeri atanması, kullanicidan yetki sorgulaması
    //gibi işlemler yapılabilir. yani main method çalışmadan önce yapmak istediğimiz bir işlem varsa onun için.
}
