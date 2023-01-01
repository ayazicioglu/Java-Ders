package ders17_Arrays;

public class C06_MuDiAr {
    public static void main(String[] args) {
        //verilen iki katlı String bir array'de
        //istenen metni iceren elementleri yazdiran method olusturun

        String[][] arr={{"Ali","Zafer"},{"Betul","Huseyin","Hasan"},{"Said"}};

        String arananMetin="a";
        istenenElementleriYazdir(arr,arananMetin);
        istenenElementleriYazdir(arr,"e");
    }
    public static void istenenElementleriYazdir (String[][]arr,String arananMetin){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].contains(arananMetin)){
                    System.out.print(arr[i][j]+" ");
                }

            }

        }
        System.out.println("");
    }
}
