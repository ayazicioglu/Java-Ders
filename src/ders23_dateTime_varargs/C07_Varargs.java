package ders23_dateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {
        //Kactane string arguement yazılırsa yazılsın
        //Arguementlerin en uzun olanını yazdiran bir metot olusturalım
        //NOT: en uzun kelime olarak 1 den fazla kelime varsa, ilkini yazdirin

        enUzunuYazdir("Ilyas","Berk","Murat");
        enUzunuYazdir("Mehmet","Vahit","Nurcan","Java","Zafer","Kerime");
    }

    private static void enUzunuYazdir(String... kelimeler) {
        String enUzunKelime=kelimeler[0];
        for (String eachKelime:
             kelimeler) {
            if (eachKelime.length()>enUzunKelime.length()){
                enUzunKelime=eachKelime;
            }

        }
        System.out.println(enUzunKelime);
    }
}
