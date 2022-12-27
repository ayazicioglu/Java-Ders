package ders10_StringMan_nul;

public class C03_replacceALLMeth {
    public static void main(String[] args) {
        //bu metindeki sayılardan kurtulalım
        String str="Ja1va 56Guz,zel-dir";

        System.out.println(str.replace("1","")
                .replace("5","")
                .replace("6",""));

     //yiyosa bu metindekilerden kurtulalım. replace() zaten istenen degisikligi verilen
        //ozellige uyan tum degerler icin uygular. eger genellemeyi butun sayilari, butun space'leri
        // yada butun ozel karakterleri kapsayacak sekilde genisletmek istersek replace yerine replaceAll kullanırz

        str="Ja1va4 56G7uz,z9el-d0ir8";

        // \\d: butun digitler
        str.replaceAll("\\d","");
        System.out.println(str.replaceAll("\\d", ""));

        // ozel karakterlerden de kurtulalım


        str=str.replace(" ","5");

        System.out.println(str.replaceAll("\\W", ""));

        str=str.replace("5","");



    }
}
