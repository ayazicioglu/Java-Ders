package ders34_maps_nestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C04_Compute {
    public static void main(String[] args) {
        //verilen bir String array'de her bir sayının kaçar defa kullanıldığını yazdırın
        //Örnek: String[] arr={"A","C","B","N","A","N","A"}
        //output: A=3, B=1, C=1, N=2
        String[] arr={"A","C","B","N","A","N","A"};
        //1.yöntem
        Map<String,Integer> harfSayilari=new TreeMap<>();

        for (int i = 0; i <arr.length ; i++) {
            if (!harfSayilari.containsKey(arr[i])){
                harfSayilari.put(arr[i],1);
            }else {
                int eskiKullanimMiktari=harfSayilari.get(arr[i]);
                harfSayilari.put(arr[i],eskiKullanimMiktari+1);
            }
        }
        System.out.println(harfSayilari);//{A=3, B=1, C=1, N=2}

        //2.yöntem compute
        Map<String,Integer> harfSayilari2=new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {

            harfSayilari2.computeIfPresent(arr[i],(k,v)->v+1);
            harfSayilari2.computeIfAbsent(arr[i],v ->1);

        }
        System.out.println(harfSayilari2);
    }
}
