package ders10_StringMan_nul;

public class C06_replaceGuzelSorus {
    public static void main(String[] args) {
       // Scanner scan=new Scanner(System.in);
        // System.out.println("Bir sifre giriniz:");
        // String sifre=scan.nextLine();

        String sifre="abc14 53334";

        int flag=0;
        if (!(sifre.charAt(0)>='a'&& sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt((sifre.length()-1))<='9')){
            System.out.println("son karakter rakam olmali");
            flag++;
        }
        if ((sifre.contains(" "))){
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }
        if (!(sifre.length()>=10)){
            System.out.println("uzunluk on karakter olmali");
            flag++;
        }
        if (flag==0) System.out.println("sifre basarili");
        //System.out.println(flag);
    }
}
