package ders9_StringManuplations;

import java.util.Scanner;

public class C06_IndexOf_Method {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String str=scan.nextLine();
        // Sinavlarimizda cokdan secmeli sorular kullaniyoruz
        // javayi cok seviyoruz
        // bu kadar coklu secenek olur mu ?

        if (!str.contains("cok"))
            System.out.println("girilen cümlede cok ile baslayan kelime yok");

        else {
            int cokIndex=str.indexOf("cok");
            int bosIndex=str.indexOf(" ",cokIndex+1);

            System.out.println(str.substring(cokIndex, bosIndex));
        }
    }
}
