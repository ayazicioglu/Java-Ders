package ders27_Overriding;

public class CAvciKuslar extends BKuslar{
    protected void hareket(){
        System.out.println("uçarlar");
    }
    protected void beslenme(){
        System.out.println("et yerler");
    }
    protected void pence(){
        System.out.println("pençelidir");
    }
    protected  void gaga(){
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
        CAvciKuslar kartal1=new CAvciKuslar(); //<<<<<iyi bak buraya constructor ve data türü aynı
        kartal1.hareket();// C yani kendi class'ından kullanır >> uçarlar
        kartal1.beslenme();// C yani kendi class'ından kullanır >> et yerler
        kartal1.pence();// C yani kendi class'ından kullanır >> pençelidir
        kartal1.gaga();// C yani kendi class'ından kullanır >> sivri gagali

        kartal1.kanat();// B yani parent dan çalışacak >> kanatlidirlar
        kartal1.solunum();// B yani parent dan çalışacak >> akcigerle nefes alırlar
        kartal1.cogalma();// B yani parent dan çalışacak >> yumurtayla çoğalırlar

        kartal1.omur();// A yani parent'in parent'indan çalışacak >> yasar ve olurler

        //Eger constructor ve data türü aynı ise özelliğin variable veya method olmasına bakılmaksızın
        //o class'a gidilir, o class veya parent class'larda bulunan İLK DEĞERİ kullanır

        BKuslar kartal2=new CAvciKuslar();// data türümüz BKuslar class'ı, constructor CAvciKuslar
        kartal2.hareket();// C parent'e bak bul ama bulunan method child class'da override edilmiş >> uçarlar
        kartal2.beslenme();// C parent'e bak bul ama bulunan method child class'da override edilmiş >> et yerler
        //kartal2.pence();// kendi data türünde pence() arar bulamaz, parent'e git, yok ise CTE'yi bas!
        kartal2.gaga();// B yani kendi class'ında bulur override edilmiş mi diye bakar onu alır yani C>> sivri gagali

        kartal2.kanat();// B yani kendi classından çalışacak, override edilmiş mi diye kontrol et >> kanatlidirlar
        kartal2.solunum();//B yani kendi classından çalışacak, override edilmiş mi diye kontrol et >> akcigerle nefes alırlar
        kartal2.cogalma();// B yani kendi classından çalışacak, override edilmiş mi diye kontrol et >> yumurtayla çoğalırlar

        kartal2.omur();// A yani parent'indan çalışacak >> yasar ve olurler

        AHayvanlar kartal3=new CAvciKuslar(); //data türmüz AHayvanlar class'ı, constructor CAvciKuslar
        kartal3.hareket();// A kendi class'ında bul method child class'larda override edilmiş mi, evet>> uçarlar
        kartal3.beslenme();// A kendi class'ında bul method child class'larda override edilmiş mi, evet >> et yerler
        //kartal2.pence();// A kendi data türünde pence() arar bulamaz, child'lere BAKAMAZ, yok ise CTE'yi bas!
        //kartal3.gaga();// A kendi data türünde gaga() arar bulamaz, child'lere BAKAMAZ, yok ise CTE'yi bas!

        //kartal3.kanat();//A kendi data türünde kanat() arar bulamaz, child'lere BAKAMAZ, yok ise CTE'yi bas!
        kartal3.solunum();//A kendi class'ında bul method child class'larda override edilmiş mi, evet >> akcigerle nefes alırlar
        kartal3.cogalma();//A kendi class'ında bul method child class'larda override edilmiş mi, evet >> yumurtayla çoğalırlar

        kartal3.omur();//  kendi class'ında bul method child class'larda override edilmiş mi, hayır >> yasar ve olurler


    }
}
