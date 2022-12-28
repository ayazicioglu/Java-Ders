package ders11_forLoops;

public class C07_TerseCevirmek {
    public static void main(String[] args) {
        //Scanner scan=new Scanner(System.in);
        //System.out.println("Lütfen bir kelime giriniz");
        String str="Java ogrenmek icin cok calismak lazim";

        String aynagoruntusu="";
        for (int i = str.length()-1; i >=0 ; i--) {
            aynagoruntusu+=str.substring(i,i+1);
        }
        System.out.println("Girilen cümlenin tersten yazilisi: "+aynagoruntusu);
    }
}
