package ders31_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {

    public static void main(String[] args) {

        /*
        Collection's objeleri bir arada tutan yapılardır. Gerçek hayattaki ihtiyaçlara göre Java farklı collection
        yapıları oluşturmuştur.
        Bir uygulamada hangi collection'ı kullanacağımıza istediğimiz özelliklere ve ihtiyacımıza göre karar veririz.
        Collections temelde 3 ana gruba ayrılır ve 3 Interface ile kuralları belirlenmiştir.
        -List
        -Queue
        -Set
        Ancak Interface'lerden obje oluşturulamayacağı için child class'larının constructor'ları kullanılır.
        Burada özellikleri belirleyen constructor değil data türü olark seçilen collection dur.

        Ornegin LinkedList oluştururken seçeceğimiz data turu ile
        Queue, Deque, List veya tümünün özelliklerini taşıyan LinkedList'ler oluşturabiliriz.
         */
        LinkedList<String> ll1=new LinkedList<>();
        List<String> ll2=new LinkedList<>();
        Queue<String> ll3=new LinkedList<>();
        Deque<String> ll4=new LinkedList<>();
    }
}
