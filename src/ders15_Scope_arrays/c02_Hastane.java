package ders15_Scope_arrays;

public class c02_Hastane {
    static String hastaneIsmi= "Yıldız Hastanesi";
    static String hastaneAdresi= "Cankaya/Ankara";

    String personelIsmi="Personel";
    String personelAdresi="Adres";
    String personelTel="Telefon";

    public static void main(String[] args) {
        c02_Hastane per1=new c02_Hastane();
        c02_Hastane per2=new c02_Hastane();

        per1.personelIsmi="Harun";
        per2.personelAdresi="Çankaya";
        per1.hastaneIsmi="Java Hastanesi";

        System.out.println(per1.personelTel);//Telefon
        System.out.println(per1.personelIsmi);//Harun
        System.out.println(per2.personelIsmi);//Personel
        System.out.println(per2.personelAdresi);//Çankaya
        System.out.println(per1.hastaneIsmi);//Java Hastanesi
        System.out.println(per2.hastaneIsmi);//Java Hastanesi
        System.out.println(hastaneIsmi);//Java Hastanesi

        per1.personelIsmi="Mehmet";
        System.out.println(per2.personelIsmi);//Mehmet
        System.out.println(per2.personelIsmi);//Personel
    }
}
