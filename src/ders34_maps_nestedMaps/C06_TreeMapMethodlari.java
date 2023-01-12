package ders34_maps_nestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMapMethodlari {
    public static void main(String[] args) {
        TreeMap<String,Integer> harfSsayilariMap=new TreeMap<>();
        harfSsayilariMap.put("A",10);
        harfSsayilariMap.put("C",15);
        harfSsayilariMap.put("D",3);
        harfSsayilariMap.put("K",5);

        System.out.println(harfSsayilariMap);//{A=10, C=15, D=3, K=5}

        //subMap başlangıç ve bitiş key i girip map elde ediyoz. altMap
        System.out.println(harfSsayilariMap.subMap("C", "F"));//{C=15, D=3}
        System.out.println(harfSsayilariMap.subMap("C", "K"));//{C=15, D=3} C dahil K hariç olur
        System.out.println(harfSsayilariMap.subMap("B", "K"));//{C=15, D=3} B dahil olmasa da yana geçer

        //descendingMap tersten yazdırır
        System.out.println(harfSsayilariMap.descendingMap());//{K=5, D=3, C=15, A=10}

        //lowerKey girilen değerden daha az olanlardan en büyüğü yazdırır
        System.out.println(harfSsayilariMap.lowerKey("E"));//D
        System.out.println(harfSsayilariMap.lowerKey("D"));//C

        //floorKey verilen key'e eşit veya daha küçük olanlardan en büyüğü verir
        System.out.println(harfSsayilariMap.floorKey("E"));//D
        System.out.println(harfSsayilariMap.floorKey("D"));//D

       //higherKey girilen key değerden büyük olanlardan en küçüğü yazdırır
        System.out.println(harfSsayilariMap.higherKey("D"));//K

        //ceilingKey verilen key'e eşit veya daha büyük olanlardan en küçüğü verir
        System.out.println(harfSsayilariMap.ceilingKey("D"));//D

       //map'in güncel halini görelim
        System.out.println(harfSsayilariMap);//{A=10, C=15, D=3, K=5}

        //headMap gireceğimiz key'den başa doğru olanları verir
        System.out.println(harfSsayilariMap.headMap("D"));//{A=10, C=15}

        //D dahil olsun istiyorsak true ekleriz
        System.out.println(harfSsayilariMap.headMap("D", true));//{A=10, C=15, D=3}

        //tailMap girilen key'den kuyruğa kadar olanlari verir. substring gibi başlangıç dahil bitiş dahil değil
        System.out.println(harfSsayilariMap.tailMap("C"));//{C=15, D=3, K=5}

        //tailMap de C hariç olsun istiyorsak false ekleriz
        System.out.println(harfSsayilariMap.tailMap("C", false));//{D=3, K=5}

       // pollFirstEntry map'den ilk key'i siler ama bize döndürür
        System.out.println(harfSsayilariMap.pollFirstEntry());//A=10
        System.out.println(harfSsayilariMap);//{C=15, D=3, K=5} bu hale geldi

        //harfSsayilariMap map'den son key'i siler ama bize döndürür
        System.out.println(harfSsayilariMap.pollLastEntry());//K=5
        System.out.println(harfSsayilariMap);//{C=15, D=3}


    }
}
