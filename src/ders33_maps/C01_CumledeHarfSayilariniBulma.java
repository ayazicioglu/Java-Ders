package ders33_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_CumledeHarfSayilariniBulma {
    public static void main(String[] args) {
        //verilen bir cümlede kullanılan her bir harfi
        // ve kaçar kez kullanıldığını yazdirin
        // ornek: Java candir
        //output: J=1, a=3, v=1, c=1, n=1, d=1, i=1, r=1

        String cumle="Java candir";
        //oncelikle boslugu yok edelim

        cumle=cumle.replaceAll("\\W","");//word olmayan herşeyi yok edelim
        String[] cumleArr=cumle.split("");//[J, a, v, a, c, a, n, d, i, r] bu hale geldi

        Map<String,Integer> kullanimSayilariMap=new TreeMap<>();
        for (int i = 0; i < cumleArr.length; i++) {
            //her bir elementi ele alıp map'te key olarak yok ise value=1 olarak eklenir
            //map'te key olarak var ise value 1 artırılır

            if (!kullanimSayilariMap.containsKey(cumleArr[i])){
                kullanimSayilariMap.put(cumleArr[i],1);
            }else {
                int eskiValue=kullanimSayilariMap.get(cumleArr[i]);
                kullanimSayilariMap.put(cumleArr[i],eskiValue+1);
            }
        }
        System.out.println(kullanimSayilariMap);
    }
}
