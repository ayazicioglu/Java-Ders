package ders12_methodCreation;

public class C07_TersCevirme {
    public static void main(String[] args) {
        //verilen bir Stringi terse cevirip
        //o halini bize donduren bir metot olusturalim

        System.out.println(metniTerseCevir("java candir"));
    }
    public static String metniTerseCevir(String str){
        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.charAt(i);
        }return tersStr;
    }
}
