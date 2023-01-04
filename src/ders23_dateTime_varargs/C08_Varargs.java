package ders23_dateTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {
        /*
        Arguement olarak tam sayilar alıp ilk arguement hariç geriye kalanları toplayıp,
        bulunan toplami ilk arguement ile carpip sonucu yazdiran bir method oluşturun
        (Not: arguement sayısı değişken olabilir)
         */
        islemYap(3,4,5,8,1,2);//60
        islemYap(5,1);//5
        islemYap(4);//0
        islemYap(3,4,5,6);//45
    }

    private static void islemYap(int ilkSayi, int...geriyeKalanlar) {
        int geriyeKalanToplam=0;
        for (int each:
             geriyeKalanlar) {
            geriyeKalanToplam+=each;

        }
        System.out.println(ilkSayi*geriyeKalanToplam);
    }
}
