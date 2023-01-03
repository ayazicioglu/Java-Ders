package ders19_ArrayList_forEachLoop;

public class C06_forEachLoopSorusu {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin

        String cumle="Java ogrenmek cok guzel";
        String harf="e";

        String[] cumleArr=cumle.split("");
        //System.out.println(Arrays.toString(cumleArr)); aşağıdaki hale getirir
        //[J, a, v, a,  , o, g, r, e, n, m, e, k,  , c, o, k,  , g, u, z, e, l]

        int sayac=0;
        for (String eachHarf:cumleArr){
            if (eachHarf.equals(harf)){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("harf cumlede kullanilmamis");
        }else System.out.println(harf+" harfi cümlede "+sayac+" defa kullanılmış");
    }
}
