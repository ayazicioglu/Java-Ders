package ders34_maps_nestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {

    public static void main(String[] args) {
        Map<String,Integer> harfSsayilariMap=new TreeMap<>();
        harfSsayilariMap.put("A",10);
        harfSsayilariMap.put("C",15);
        harfSsayilariMap.put("D",3);
        harfSsayilariMap.put("K",5);

        System.out.println(harfSsayilariMap);//{A=10, C=15, D=3, K=5}

        //A'nin kullanım miktarını 20 yapin
        harfSsayilariMap.put("A",20);

        //C'nin kullanım miktarını iki katına çıkarin
        harfSsayilariMap.put("C",harfSsayilariMap.get("C")*2);

        System.out.println(harfSsayilariMap);//{A=20, C=30, D=3, K=5}

        //D'nin miktarını 5 artiralim
        harfSsayilariMap.compute("D",(k,v)->v+5);
        System.out.println(harfSsayilariMap);//{A=20, C=30, D=8, K=5}

        //eğer map'de T varsa kullanım miktarını 3 eksiltin
        harfSsayilariMap.computeIfPresent("T",(k,v)->v-3);
        System.out.println(harfSsayilariMap);//{A=20, C=30, D=8, K=5}

        //eğer map'de K varsa kullanım miktarını 2 eksiltin
        harfSsayilariMap.computeIfPresent("K",(a,b)->b-2);// illa (k,v)->v- olmak zorunda değil böylede olur
        System.out.println(harfSsayilariMap);//{A=20, C=30, D=8, K=3}

        //T harfi yoksa kullanım miktarı 3 olarak T ekleyin
        harfSsayilariMap.computeIfAbsent("T",v->3);
        System.out.println(harfSsayilariMap);//{A=20, C=30, D=8, K=3, T=3}


    }
}
