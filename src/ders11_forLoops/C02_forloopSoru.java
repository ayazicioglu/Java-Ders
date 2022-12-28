package ders11_forLoops;

public class C02_forloopSoru {
    public static void main(String[] args) {

        //alınan bir inputta çift indeksi olan karakteri büyük
        //tek indeksi olan karakteri kücük yazdirin

        String input="Java candir, selenium heyecandir";

        for (int i = 0; i < input.length(); i++) {
            System.out.print(i%2==0  //indeks çift mi
                    ?input.substring(i,i+1).toUpperCase() //çift ise çalışacak kod
                    :input.substring(i,i+1).toLowerCase()); //tek ise çalışacak kod

        }


    }
}
